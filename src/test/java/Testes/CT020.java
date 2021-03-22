package Testes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.Siagri2;
import pages.Siagri3;
import pages.pagesObj;
import suporte.Web;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CT020 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }

    @Test //Executa o teste
    public void ExecutaCT020  () {
        String textodistribuidor = new Siagri3(navegador)
                .capturarTexto();
        assertEquals("Distribuidor de insumos", textodistribuidor);




    }
    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }

}
