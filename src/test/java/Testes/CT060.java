package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Siagri;
import pages.Siagri2;
import pages.Siagri7;
import pages.Siagri8;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class CT060 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome6();

    }

    @Test
    public void ExecutaCT060  () {
        String textodistribuidor = new Siagri8(navegador)
                .capturarTexto();

        assertEquals("https://www.siagri.com.br/segmentos/sementeira", textodistribuidor);

    }

    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
