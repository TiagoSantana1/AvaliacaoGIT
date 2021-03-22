package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Siagri {
    private WebDriver navegador;

    public  Siagri (WebDriver navegador){
        this.navegador = navegador;

    }

    //captura o texto  e retorna
    public String capturarTexto(){
       return navegador.findElement(By.xpath("//h2")).getText();

    }


}
