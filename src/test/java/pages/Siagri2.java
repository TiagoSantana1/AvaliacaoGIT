package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Siagri2 {
    private WebDriver navegador;

    public Siagri2(WebDriver navegador){
        this.navegador = navegador;

    }

    //captura o texto  e retorna
    public String capturarTexto(){
       return navegador.findElement(By.xpath("//p")).getText();

    }




}
