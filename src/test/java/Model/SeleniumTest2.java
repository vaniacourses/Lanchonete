package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SeleniumTest2 {

	private static WebDriver driver;
	 private static WireMockServer wireMockServer;
	 private static String NOME = "nomeLanche";
	 private static String TIPO = "SelectPao";
	 private static String DESCRICAO = "textArea3";
	
	
	 @BeforeEach
	 void setUp() {
		  wireMockServer = new WireMockServer();
	        wireMockServer.start();

	        // Configure WireMock to respond to specific requests
	        configureWireMock();
		 driver = new FirefoxDriver();
	 }
	 

	@Test
    public void testHabilitadoNome() {
        // Open the webpage with the select tag
		driver.get("http://localhost:8080/lanchonete/view/montarLanche/montarLanche.html");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(NOME)));

        WebElement lancheInput = driver.findElement(By.id(NOME));
        assertTrue(lancheInput.isEnabled(), "Lanche input field is disabled");
        

        WebElement submitButton = driver.findElement(By.name("Adicionar"));
        submitButton.click();

        // Add assertions or verifications based on your test requirements
    }
	@Test
    public void testHabilitadoDescricao() {
        // Open the webpage with the select tag
		driver.get("http://localhost:8080/lanchonete/view/montarLanche/montarLanche.html");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(NOME)));

        
   	 
        WebElement descricaoTextarea = driver.findElement(By.id(DESCRICAO));
        assertTrue(descricaoTextarea.isEnabled(), "Descricao textarea is disabled");
        


        WebElement selectPao = driver.findElement(By.id(TIPO));
        assertTrue(selectPao.isEnabled(), "SelectPao dropdown is disabled");


        WebElement submitButton = driver.findElement(By.name("Adicionar"));
        submitButton.click();

        // Add assertions or verifications based on your test requirements
    }
	@Test
    public void testHabilitadolTipo() {
        // Open the webpage with the select tag
		driver.get("http://localhost:8080/lanchonete/view/montarLanche/montarLanche.html");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(NOME)));

        WebElement selectPao = driver.findElement(By.id(TIPO));
        assertTrue(selectPao.isEnabled(), "SelectPao dropdown is disabled");


        WebElement submitButton = driver.findElement(By.name("Adicionar"));
        submitButton.click();

        // Add assertions or verifications based on your test requirements
    }
	@Test
    public void testVisivelNome() {
		    driver.get("http://localhost:8080/lanchonete/view/montarLanche/montarLanche.html");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(NOME)));

        WebElement lancheInput = driver.findElement(By.id(NOME));
        assertTrue(lancheInput.isDisplayed(), "Lanche input field is not visible");
        

        WebElement submitButton = driver.findElement(By.name("Adicionar"));
        submitButton.click();

        // Add assertions or verifications based on your test requirements
    }
	@Test
    public void testVisivelDescricao() {
        // Open the webpage with the select tag
		driver.get("http://localhost:8080/lanchonete/view/montarLanche/montarLanche.html");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(NOME)));

        
   	 
        WebElement descricaoTextarea = driver.findElement(By.id(DESCRICAO));
        assertTrue(descricaoTextarea.isDisplayed(), "Descricao textarea is not visible");
        


        WebElement selectPao = driver.findElement(By.id(TIPO));
        assertTrue(selectPao.isEnabled(), "SelectPao dropdown is disabled");


        WebElement submitButton = driver.findElement(By.name("Adicionar"));
        submitButton.click();

        // Add assertions or verifications based on your test requirements
    }
	@Test
    public void testVisivelTipo() {
        // Open the webpage with the select tag
		configureWireMock();
		driver.get("http://localhost:8080/lanchonete/view/montarLanche/montarLanche.html");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(NOME)));

        WebElement selectPao = driver.findElement(By.id(TIPO));
        assertTrue(selectPao.isDisplayed(), "SelectPao dropdown is not visible");


        WebElement submitButton = driver.findElement(By.name("Adicionar"));
        submitButton.click();

        // Add assertions or verifications based on your test requirements
    }

	private static void configureWireMock() {
	    // Configure WireMock to respond to specific requests
	    WireMock.configureFor("localhost", 8080);

	    // Example: Mock a response for a specific URL
	    WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/lanchonete/view/montarLanche/montarLanche.html"))
	            .willReturn(WireMock.aResponse()
	                    .withStatus(200)
	                    .withHeader("Content-Type", "text/html")
	                    .withBody("<html>\r\n"
	                    		+ "    <head>\r\n"
	                    		+ "        <title>Painel de Controle</title>\r\n"
	                    		+ "        <meta charset=\"UTF-8\">\r\n"
	                    		+ "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
	                    		+ "        <script src=\"../scripts/conexao.js\"></script>\r\n"
	                    		+ "        <link rel=\"stylesheet\" type=\"text/CSS\" href=\"../styles/global.css\"/>\r\n"
	                    		+ "        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
	                    		+ "        <link rel=\"stylesheet\" href=\"./styles.css\">\r\n"
	                    		+ "        <script src=\"./montarLanche.js\"></script>\r\n"
	                    		+ "        <link href=\"https://fonts.googleapis.com/css2?family=Sansita:ital,wght@1,700&display=swap\" rel=\"stylesheet\">\r\n"
	                    		+ "    </head>    \r\n"
	                    		+ "    <script>getInfo()</script>\r\n"
	                    		+ "    <body>\r\n"
	                    		+ "        <div class=\"containerMontar\">\r\n"
	                    		+ "            <header class=\"headerPage\">\r\n"
	                    		+ "                <div id=\"logo\"><a href=\"../home/home.html\"><img src=\"../assets/logo02.png\" id=\"imagemLogo2\"></a></div>\r\n"
	                    		+ "\r\n"
	                    		+ "                <div class=\"containerNavButton\">\r\n"
	                    		+ "\r\n"
	                    		+ "                </div>\r\n"
	                    		+ "                <div class=\"containerAction\">\r\n"
	                    		+ "                </div>\r\n"
	                    		+ "            </header>\r\n"
	                    		+ "            <div class=\"containerPage\">\r\n"
	                    		+ "                \r\n"
	                    		+ "                <div class=\"containerConteudo\">\r\n"
	                    		+ "                        <div class=\"iconArrow\">\r\n"
	                    		+ "                            <a href=\"../home/home.html\">\r\n"
	                    		+ "                                <img class=\"iconArrowLeft\" src=\"../assets/keyboard.svg\"/>\r\n"
	                    		+ "                            </a>     \r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div class=\"containerAgrupados\">\r\n"
	                    		+ "                            <div class=\"containerEspaco\">\r\n"
	                    		+ "                                \r\n"
	                    		+ "                            </div>\r\n"
	                    		+ "                            <div class=\"containerEspacoB\">\r\n"
	                    		+ "                                <div class=\"containerTitle\">\r\n"
	                    		+ "                                    <h1 class=\"titleTypeContainer\">Monte agora seu lanche!</h1>\r\n"
	                    		+ "                                </div>\r\n"
	                    		+ "                            </div>\r\n"
	                    		+ "\r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div class=\"containerTitleTable\">\r\n"
	                    		+ "                            <h1 class=\"titleTypeContainerTable\">Defina o seu lanche</h1>\r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div class=\"containerInputSelect\">\r\n"
	                    		+ "                            <input id=\"nomeLanche\" class=\"TextInput\" name=\"nome\" placeholder=\"Lanche\" required/>\r\n"
	                    		+ "                            <textarea id=\"textArea3\" class=\"TextInput\"  placeholder=\"Descrio\" rows=\"4\" cols=\"50\" name=\"descricao\"></textarea>\r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div class=\"containerTitleTable\">\r\n"
	                    		+ "                            <h1 class=\"titleTypeContainerTable\">Escolha o seu po</h1>\r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div class=\"containerInputSelect\">\r\n"
	                    		+ "                            <select id=\"SelectPao\" class=\"TextInput\" name=\"tipo\" required>\r\n"
	                    		+ "                                <option value=\"\">Po</option>\r\n"
	                    		+ "                            </select>\r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div class=\"containerTitleTable\">\r\n"
	                    		+ "                            <h1 class=\"titleTypeContainerTable\">Vamos turbinar ?</h1>\r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div id=\"ingredientes\">\r\n"
	                    		+ "\r\n"
	                    		+ "                        </div>\r\n"
	                    		+ "                        <div class=\"buttonInputContainer\">\r\n"
	                    		+ "                            <button class=\"buttonSubmitCancel\" onclick=\"window.location.replace('../menu/menu.html')\" name=\"cancelar\" >Cancelar</button>\r\n"
	                    		+ "                            <button class=\"buttonSubmitSalvar\" onclick=\"salvarLanche()\" name=\"Adicionar\">Adicionar <br> <p id=\"valor1\">R$ 0.00</p></button>\r\n"
	                    		+ "                            \r\n"
	                    		+ "                        </div>")));
	}



	  @AfterEach
	  public void quit() {
	    if (driver != null) {
	      driver.quit();
	    }
	    wireMockServer.stop();
        driver.quit();
	  }

}
