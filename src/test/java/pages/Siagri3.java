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
      //  WebElement descricao = navegador.findElement(By.xpath("//div[@id='seg-3']/a"));
      //  WebElement descricao = navegador.findElement(By.className("segmento-item seg-3"));
      //  navegador.getTitle();
     //  String descricao2 = navegador.getTitle();
       navegador.findElement((By.xpath("//div[@id='seg-3']/a"))).getText();
       String texto = navegador.findElement((By.xpath("//div[@id='seg-3']/a"))).getText();
     //  Boolean descricao3 = navegador.findElement((By.xpath("//div[@id='seg-3']/a"))).isSelected();

        return navegador.findElement((By.xpath("//div[@id='seg-3']/a"))).getText();

    }




}
