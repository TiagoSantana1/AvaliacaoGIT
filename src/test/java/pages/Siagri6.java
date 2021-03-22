package pages;

import org.openqa.selenium.WebDriver;

public class Siagri6 {
    private WebDriver navegador;

    public Siagri6(WebDriver navegador){
        this.navegador = navegador;

    }

    //captura o texto  e retorna
    public String capturarTexto(){

        //pega a página ativa e retorna

        return navegador.getCurrentUrl();

    }

}
