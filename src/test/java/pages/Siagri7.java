package pages;

import org.openqa.selenium.WebDriver;

public class Siagri7 {
    private WebDriver navegador;

    public Siagri7(WebDriver navegador){
        this.navegador = navegador;

    }

    //captura o texto  e retorna
    public String capturarTexto(){

        //pega a p�gina ativa e retorna

        return navegador.getCurrentUrl();

    }

}
