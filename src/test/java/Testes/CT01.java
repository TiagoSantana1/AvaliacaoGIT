package Testes;

import org.junit.After;
import org.junit.Before;
import suporte.Web;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import suporte.Web;

public class CT01 {
    private WebDriver navegador;

    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }

    @Test
    public void ExecutaCT01  () {

        //Executa o teste


    }
    @After

        //Fechar o site
     public void tearDown() {
            navegador.quit();
        }




}
