package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Siagri;
import pages.Siagri2;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class CT030 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }

    @Test
    public void ExecutaCT030  () {
        String textodistribuidor = new Siagri(navegador)
        .capturarTexto();
        String textodistribuidor2 = new Siagri2(navegador)
               .capturarTexto();

        assertEquals("Loja agropecuária", textodistribuidor);


    }

    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
