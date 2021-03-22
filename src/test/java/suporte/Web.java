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

    public static WebDriver createChrome2 () {

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a pagina da Siagri
        navegador.get("http://www.siagri.com.br");
        //navegando para segmentos
        //navegador.get("https://www.siagri.com.br/segmentos");
         navegador.get ("https://www.siagri.com.br/segmentos/loja-agropecuaria");

        return navegador;
    }

    public static WebDriver createChrome3 () {

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a pagina da Siagri
        navegador.get("http://www.siagri.com.br");
        //navegando para segmentos
        //navegador.get("https://www.siagri.com.br/segmentos");
        navegador.get("https://www.siagri.com.br/segmentos/armazens-gerais");

        return navegador;

    }
    public static WebDriver createChrome4 () {

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a pagina da Siagri
        navegador.get("http://www.siagri.com.br");
        //navegando para Armagens Gerais

        navegador.get("https://www.siagri.com.br/segmentos/armazens-gerais");

        return navegador;


    }

    public static WebDriver createChrome5 () {

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a pagina da Siagri
        navegador.get("http://www.siagri.com.br");
        //navegando para Armagens Gerais

        navegador.get("https://www.siagri.com.br/segmentos/produtor-agricola");

        return navegador;

    }

    public static WebDriver createChrome6 () {

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a pagina da Siagri
        navegador.get("http://www.siagri.com.br");
        //navegando para Armagens Gerais

        navegador.get("https://www.siagri.com.br/segmentos/sementeira");

        return navegador;

    }



}

