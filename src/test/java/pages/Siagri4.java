package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Siagri4 {
    private WebDriver navegador;

    public Siagri4(WebDriver navegador){
        this.navegador = navegador;

    }

    //captura o texto  e retorna
    public String capturarTexto(){

        //pega a página ativa e retorna

        return navegador.getCurrentUrl();

    }

}
