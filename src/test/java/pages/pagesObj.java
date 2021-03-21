package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pagesObj {

    private WebDriver navegador;
    //construtor
    public pagesObj (WebDriver navegador){
        this.navegador = navegador;

    }

    public Siagri getdados(){

        WebElement linkdistribuidor = navegador.findElement(By.xpath("//section[2]"));
        String textodistribuidor = linkdistribuidor.getText();

        return new Siagri(navegador);

    }

    public String capturarTexto(){
        return navegador.findElement(By.xpath("//section[2]")).getText();


    }


}
