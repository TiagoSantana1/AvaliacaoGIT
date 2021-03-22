package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Siagri3 {
    private WebDriver navegador;

    public Siagri3(WebDriver navegador){
        this.navegador = navegador;

    }

    //captura o texto  e retorna
    public String capturarTexto(){

        //pega a página ativa e retorna
        return navegador.findElement((By.xpath("//div[@id='seg-3']/a"))).getText();

    }

}
