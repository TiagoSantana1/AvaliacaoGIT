package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class CT050 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome5();

    }

    @Test
    public void ExecutaCT050  () {
        String textodistribuidor = new Siagri7(navegador)
                .capturarTexto();

        assertEquals("https://www.siagri.com.br/segmentos/produtor-agricola", textodistribuidor);

    }

    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
