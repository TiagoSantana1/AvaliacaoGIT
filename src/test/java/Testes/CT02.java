package Testes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.pagesObj;
import suporte.Web;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CT02 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }

    @Test
    public void ExecutaCT02  () {
     //   String textodistribuidor = new pagesObj(navegador)
                //Executa o teste



    }
    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
