package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Siagri {
    private WebDriver navegador;

    public  Siagri (WebDriver navegador){
        this.navegador = navegador;

    }

    public Siagri getdados(){

        navegador.findElement(By.xpath("//section[2]"));

    return new Siagri(navegador);

    }

}
