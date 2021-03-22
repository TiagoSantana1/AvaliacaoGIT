package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

    public static WebDriver createChrome () {

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a pagina da Siagri
        navegador.get("http://www.siagri.com.br");
        //navegando para segmentos
        navegador.get("https://www.siagri.com.br/segmentos");
      //  navegador.get ("https://www.siagri.com.br/segmentos/loja-agropecuaria");

        return navegador;
    }



    }

