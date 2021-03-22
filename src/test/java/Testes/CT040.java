package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Siagri;
import pages.Siagri2;
import pages.Siagri4;
import pages.Siagri5;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class CT040 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome3();

    }

    @Test
    public void ExecutaCT040  () {
        String textodistribuidor = new Siagri5(navegador)
                .capturarTexto();

        assertEquals("https://www.siagri.com.br/segmentos/armazens-gerais", textodistribuidor);

    }

    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
