package Testes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.pagesObj;
import suporte.Web;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CT021 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }

    @Test
    public void ExecutaCT021  () {
        String textodistribuidor = new pagesObj(navegador)
                .capturarTexto();

        assertEquals(" Distribuidor de insumos\n Loja agropecuária\n Armazéns gerais\n Produtor agrícola\n Sementeira\n Outros", textodistribuidor);
    }

    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
