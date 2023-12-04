package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class seleniumTest {
	private static WebDriver driver;
	 private static String NOME = "nome";
	 private static String SOBRENOME = "sobrenome";
	 private static String TELEFONE = "telefone";
	 private static String USUARIO = "usuario";
	 private static String SENHA = "senha";
	 private static String RUA = "rua";
	 private static String NUMERO = "numero";
	 private static String BAIRRO = "bairro";
	 private static String COMPLEMENTO = "complemento";
	 private static String CIDADE = "cidade";
	 private static String ESTADO = "estado";
	 private static String user1Nome = "Lucas";
	 private static String user1sobrenome = "Panaro";
	 private static String user1Telefone = "5521999999999";
	 private static String user1Usuario = "panaro";
	 private static String user1senha = "123456";
	 private static String user1Rua = "rua";
	 private static String user1Numero = "1";
	 private static String user1Bairro = "bairro";
	 private static String user1Complemento = "complemento";
	 private static String user1Cidade = "cidade";
	 private static String user1Estado = "estado";
	 
	 @BeforeEach
	 void setUp() {
		 driver = new FirefoxDriver();
	 }
	 
	@Test
	void testSiteConnection() {
		 driver.get("localhost:8080/lanchonete");

		 assertEquals("Lanchonete", driver.getTitle().toString());
	}
	
	@Test
	void testeCriarClienteSemEndereco() {
		driver.get("http://localhost:8080/lanchonete/view/cadastro/cadastro.html");	
		WebElement nomeInput = driver.findElement(By.name(NOME));
		nomeInput.sendKeys(user1Nome);
		WebElement sobrenomeInput = driver.findElement(By.name(SOBRENOME));
		sobrenomeInput.sendKeys(user1sobrenome);
		WebElement telefoneInput = driver.findElement(By.name(TELEFONE));
		telefoneInput.sendKeys(user1Telefone);
		WebElement usuarioInput = driver.findElement(By.name(USUARIO));
		usuarioInput.sendKeys(user1Usuario);
		WebElement senhaInput = driver.findElement(By.name(SENHA));
		senhaInput.sendKeys(user1senha);
		WebElement buttonSubmit = driver.findElement(By.className("buttonSubmit"));
		buttonSubmit.click();
		Alert alert = driver.switchTo().alert();
		// Should generate a error as there is no address
		assertEquals("Ops... Ocorreu um erro no Cadastro, Tente novamente mais Tarde!", alert.getText());
	}

	@Test
	void testeCriarClienteCompleto() {
		driver.get("http://localhost:8080/lanchonete/view/cadastro/cadastro.html");	
		WebElement nomeInput = driver.findElement(By.name(NOME));
		nomeInput.sendKeys(user1Nome);
		WebElement sobrenomeInput = driver.findElement(By.name(SOBRENOME));
		sobrenomeInput.sendKeys(user1sobrenome);
		WebElement telefoneInput = driver.findElement(By.name(TELEFONE));
		telefoneInput.sendKeys(user1Telefone);
		WebElement usuarioInput = driver.findElement(By.name(USUARIO));
		usuarioInput.sendKeys(user1Usuario);
		WebElement senhaInput = driver.findElement(By.name(SENHA));
		senhaInput.sendKeys(user1senha);
		WebElement ruaInput = driver.findElement(By.name(RUA));
		ruaInput.sendKeys(user1Rua);
		WebElement numeroInput = driver.findElement(By.name(NUMERO));
		numeroInput.sendKeys(user1Numero);
		WebElement bairroInput = driver.findElement(By.name(BAIRRO));
		bairroInput.sendKeys(user1Bairro);
		WebElement complementoInput = driver.findElement(By.name(COMPLEMENTO));
		complementoInput.sendKeys(user1Complemento);
		WebElement cidadeInput = driver.findElement(By.name(CIDADE));
		cidadeInput.sendKeys(user1Cidade);
		WebElement estadoInput = driver.findElement(By.name(ESTADO));
		estadoInput.sendKeys(user1Estado);
		
		WebElement buttonSubmit = driver.findElement(By.className("buttonSubmit"));
		buttonSubmit.click();
		
		Alert alert = driver.switchTo().alert();
		// Should generate a error as there is no address
		assertEquals("Usuário Cadastrado!\n", alert.getText());
	}
	
	@Test
	void testeLoginUserCriado() {
		driver.get("http://localhost:8080/lanchonete/view/login/login.html");	
		WebElement usuarioInput = driver.findElement(By.id("loginInput"));
		usuarioInput.sendKeys(user1Usuario);
		WebElement senhaInput = driver.findElement(By.id("senhaInput"));
		senhaInput.sendKeys(user1senha);
		
		WebElement buttonSubmit = driver.findElement(By.className("buttonSubmit"));
		buttonSubmit.click();
		
		assertEquals("http://localhost:8080/lanchonete/view/carrinho/carrinho.html", driver.getCurrentUrl());
	}

	  @AfterEach
	  public void quit() {
	    if (driver != null) {
	      driver.quit();
	    }
	  }
}
