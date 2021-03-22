package pages;

import org.openqa.selenium.WebDriver;

public class Siagri8 {
    private WebDriver navegador;

    public Siagri8(WebDriver navegador){
        this.navegador = navegador;

    }

    //captura o texto  e retorna
    public String capturarTexto(){

        //pega a página ativa e retorna

        return navegador.getCurrentUrl();

    }

}
