package Testes;


import suporte.Web;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Avaliacao {
    private WebDriver navegador;

    @Test
    public void testAvaliacaoSiagri() {

     //   Web Site = new Web();
      //  Site.AbrirSite();
       // WebDriver navegador;
        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");
         navegador = new ChromeDriver();
        //Navegando para a pagina da Siagri
          navegador.get("http://www.siagri.com.br");
        //navegando para segmentos
        navegador.get("https://www.siagri.com.br/segmentos");
        // Tempo de esperar para a pagina carregar os elementos
       //  navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

         // CT-01

        //Validar segmentos atendidos buscando os segmentos pelo id do menuSegmentos

    //    WebElement linkdistribuidor = navegador.findElement(By.xpath("//section[2]"));
      //  String textodistribuidor = linkdistribuidor.getText();


        //Comparacao dos segmentos encontrados com os atendidos
      //  assertEquals("Distribuidor\nde Insumos\n", textodistribuidor);

    //  assertEquals(" Distribuidor de insumos\n Loja agropecuária\n Armazéns gerais\n Produtor agrícola\n Sementeira\n Outros", textodistribuidor);

        // CT-02


        WebElement titulo = navegador.findElement(By.xpath("//h2"));
       String titulo2 = titulo.getText();
       // comparando titulo
       assertEquals("Softwares para gestão de distribuidores e revendas de insumos agrícolas",titulo2);

        //CT-2.1
        WebElement descricao = navegador.findElement(By.xpath("//p"));
        String descricao2 = descricao.getText();
        //comparando descricao
        assertEquals("Otimize processos, reduza desperdícios e tenha o controle de suas lojas em qualquer hora e lugar. Ganhe mais rentabilidade com o software de gestão que é líder no segmento de distribuição de insumos. Com as soluções Siagri, você compra melhor, evita perdas no estoque, vende com mais eficiência e ainda tem mais segurança nas operações de Barter!", descricao2);

        //CT-2.2

        WebElement EstoqueEficiente = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li"));
        String EstoqueEficiente2 = EstoqueEficiente.getText();
        assertEquals("Estoque eficiente",EstoqueEficiente2);

        WebElement Formacaodepreco = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[3]"));
        String Formacaodepreco2 = Formacaodepreco.getText();
        assertEquals("Formação de preços",Formacaodepreco2);

        WebElement Gestaodelogistica = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[6]"));
        String Gestaodelogistica2 = Gestaodelogistica.getText();
        assertEquals("Gesta?o de logi?stica (expedic?a?o)",Gestaodelogistica2);




        WebElement Ampliar = navegador.findElement(By.xpath("//div[2]/ul/li[2]"));
        String Ampliar2 = Ampliar.getText();
        assertEquals("Ampliar mix de atividades (armazenagem, Barter etc)",Ampliar2);

        WebElement Gestao = navegador.findElement(By.xpath("//div[2]/ul/li[4]"));
        String Gestao2 = Gestao.getText();
        assertEquals("Gesta?o orc?amenta?ria",Gestao2);


        //CT-3.1


        navegador.get("https://www.siagri.com.br/solucoes/segmentos/loja-agropecuaria");
        WebElement titulo3 = navegador.findElement(By.xpath("//h3"));
        String titulo4 = titulo3.getText();
        // comparando titulo
        assertEquals("Softwares para gesta?o de lojas e varejo agropecua?rio",titulo4);

        WebElement descricao3 = navegador.findElement(By.xpath("//p"));
        String descricao4 = descricao3.getText();
        //comparando descricao
        assertEquals("Ganhe agilidade em vendas no balca?o e confianc?a nos controles de estoque e custo. Com o Grupo Siagri, gerencie sua loja agropecua?ria de forma completa", descricao4);

        //CT-3.2

        WebElement Agilidade = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li"));
        String Agilidade2 = Agilidade.getText();
        assertEquals("Agilidade no atendimento",Agilidade2);

        WebElement Eficiencia = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[2]"));
        String Eficiencia2 = Eficiencia.getText();
        assertEquals("Eficie?ncia operacional",Eficiencia2);


        WebElement Controle = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[3]"));
        String Controle2 = Controle.getText();
        assertEquals("Controle de comissionamento",Controle2);

        WebElement Conformidade = navegador.findElement(By.xpath("//div[2]/ul/li[2]"));
        String Conformidade2 = Conformidade.getText();
        assertEquals("Conformidade fiscal",Conformidade2);


        WebElement fluxo  = navegador.findElement(By.xpath("//div[2]/ul/li[3]"));
        String fluxo2 = fluxo.getText();
        assertEquals("Eficie?ncia no fluxo de caixa em dia",fluxo2);


        //CT-04.1

        navegador.get("https://www.siagri.com.br/solucoes/segmentos/armazens-gerais");
        WebElement titulo5 = navegador.findElement(By.xpath("//h3"));
        String titulo6 = titulo5.getText();
        assertEquals("Softwares para gesta?o de armaze?ns gerais e cerealistas",titulo6);


        WebElement descricao5 = navegador.findElement(By.xpath("//p"));
        String descricao6 = descricao5.getText();
        //comparando descricao
         assertEquals("Ganhe eficie?ncia desde o recebimento ate? a expedic?a?o dos gra?os. Com o Grupo Siagri, voce? gerencia todos os processos de armazenagem de gra?os com agilidade e seguranc?a.", descricao6);


        //CT-04.2

        WebElement contratos = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li"));
        String contratos2 = contratos.getText();
        assertEquals("Gesta?o de contratos",contratos2);

        WebElement terceiros = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[2]"));
        String terceiros2 = terceiros.getText();
        assertEquals("Controle de saldos de terceiros",terceiros2);

        WebElement transgenia = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[4]"));
        String transgenia2 = transgenia.getText();
        assertEquals("Controle de retenc?o?es e transgenia",transgenia2);

        WebElement Analise = navegador.findElement(By.xpath("//div[2]/ul/li"));
        String Analise2 = Analise.getText();
        assertEquals("Ana?lise de exposic?a?o",Analise2);


        WebElement prestados = navegador.findElement(By.xpath("//div[2]/ul/li[2]"));
        String prestados2 = prestados.getText();
        assertEquals("Controle de servic?os prestados.",prestados2);




        //  CT-05.1

        navegador.get("https://www.siagri.com.br/solucoes/segmentos/produtor-agricola");
        WebElement titulo7 = navegador.findElement(By.xpath("//h3"));
        String titulo8 = titulo7.getText();
        assertEquals("Softwares para gesta?o completa de fazendas",titulo8);

        WebElement descricao7 = navegador.findElement(By.xpath("//p"));
        String descricao8 = descricao7.getText();
        //comparando descricao
         assertEquals("Gestão do planejamento da safra à contabilidade. Com a SIAGRI, você gerencia sua fazenda de grãos e algodão de forma completa, desde as operações administrativas e financeiras, até as agronômicas.", descricao8);

        //  CT-05.2

        WebElement Planejamento = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li"));
        String Planejamento2 = Planejamento.getText();
        assertEquals("Planejamento de safra",Planejamento2);

        WebElement estoque = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[2]"));
        String estoque2 = estoque.getText();
        assertEquals("Gesta?o de estoque (armazenagem)",estoque2);


        WebElement custos = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[5]"));
        String custos2 = custos.getText();
        assertEquals("Controle de custos",custos2);


        WebElement processos = navegador.findElement(By.xpath("//div[2]/ul/li[3]"));
        String processos2 = processos.getText();
       assertEquals("Padronizac?a?o de processos",processos2);


        WebElement orcamentaria = navegador.findElement(By.xpath("//div[2]/ul/li[2]"));
        String orcamentaria2 = orcamentaria.getText();
        assertEquals("Gesta?o orc?amenta?ria",orcamentaria2);


        // CT-06.1

        navegador.get(" https://www.siagri.com.br/solucoes/segmentos/sementeira");
        WebElement titulo9 = navegador.findElement(By.xpath("//h3"));
        String titulo10 = titulo9.getText();
        assertEquals("Softwares para gesta?o de sementeiras",titulo10);


        WebElement descricao9 = navegador.findElement(By.xpath("//p"));
        String descricao10 = descricao9.getText();
        //comparando descricao
        assertEquals("Ganhe eficie?ncia no processo de beneficiamento de sementes. Com as soluc?o?es SIAGRI, voce? gerencia desde o recebimento do gra?o, ate? o embarque de sementes", descricao10);

        //CT-6.2

        WebElement recebimento = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li"));
        String recebimento2 = recebimento.getText();
        assertEquals("Gesta?o de recebimento, produc?a?o e expedic?a?o de sementes",recebimento2);

        WebElement lotes = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[2]"));
        String lotes2 = lotes.getText();
        assertEquals("Controle de lotes",lotes2);

        WebElement sementes = navegador.findElement(By.xpath("//section[3]/div/div[2]/div/ul/li[3]"));
        String sementes2 = sementes.getText();
        assertEquals("Gesta?o de vendas das sementes",sementes2);

        WebElement embarque = navegador.findElement(By.xpath("//div[2]/ul/li"));
        String embarque2 = embarque.getText();
        assertEquals("Logi?stica de embarque",embarque2);


        WebElement armazenagem = navegador.findElement(By.xpath("//div[2]/ul/li[3]"));
        String armazenagem2 = armazenagem.getText();
        assertEquals("Gesta?o da colheita e armazenagem de gra?os.",armazenagem2);




    }

}
