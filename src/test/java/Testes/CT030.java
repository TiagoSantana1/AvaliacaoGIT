package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Siagri;
import pages.Siagri2;
import pages.Siagri4;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class CT030 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome2();

    }

    @Test
    public void ExecutaCT030  () {
        String textodistribuidor = new Siagri4(navegador)
        .capturarTexto();

        assertEquals("https://www.siagri.com.br/segmentos/loja-agropecuaria", textodistribuidor);

    }

    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
