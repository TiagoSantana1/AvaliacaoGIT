package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Siagri;
import pages.Siagri2;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class CT061 {
    private WebDriver navegador;
    //Executa antes do teste
    @Before
    public void setUp(){
        //Abre o site
        navegador = Web.createChrome();

    }

    @Test
    public void ExecutaCT061  () {
        String textodistribuidor = new Siagri(navegador)
        .capturarTexto();
        String textodistribuidor2 = new Siagri2(navegador)
               .capturarTexto();

        assertEquals("Softwares para gest�o de distribuidores e revendas de insumos agr�colas", textodistribuidor);

        assertEquals("Otimize processos, reduza desperd�cios e tenha o controle de suas lojas em qualquer hora e lugar. Ganhe mais rentabilidade com o software de gest�o que � l�der no segmento de distribui��o de insumos. Com o Grupo Siagri, voc� compra melhor, evita perdas no estoque, vende com mais efici�ncia e ainda tem mais seguran�a nas opera��es de Barter!", textodistribuidor2);

    }

    //Executa depois do teste
    @After

    //Fechar o site
    public void tearDown() {
        navegador.quit();
    }


}
