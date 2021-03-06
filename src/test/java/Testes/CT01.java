package Testes;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Siagri;
import suporte.Web;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import suporte.Web;
import pages.pagesObj;

import static org.junit.Assert.assertEquals;

public class CT01 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }
    //Executa o teste
    @Test
    public void ExecutaCT01  () {
    String textodistribuidor = new pagesObj(navegador)
                             .capturarTexto();

        assertEquals(" Distribuidor de insumos\n Loja agropecu?ria\n Armaz?ns gerais\n Produtor agr?cola\n Sementeira\n Outros", textodistribuidor);
    }
    //Executa depois do teste
    @After

        //Fechar o site
     public void tearDown() {
            navegador.quit();
        }




}
