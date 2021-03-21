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

    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }

    @Test
    public void ExecutaCT01  () {
    String textodistribuidor = new pagesObj(navegador)
        //Executa o teste
                     .capturarTexto();

        assertEquals(" Distribuidor de insumos\n Loja agropecuária\n Armazéns gerais\n Produtor agrícola\n Sementeira\n Outros", textodistribuidor);
    }
    @After

        //Fechar o site
     public void tearDown() {
      //      navegador.quit();
        }




}
