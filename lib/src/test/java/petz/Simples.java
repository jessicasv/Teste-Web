package petz;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simples {
	String url; //endereco do site alvo
	WebDriver driver; //objeto do selenium webdriver
	
	@Before //antes do teste
	public void iniciar() {
		url = "https://www.petz.com.br";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximiza o browser
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS); 
		
	}
	
	@After //depois do teste
	public void finalizar() {
		driver.quit();
	}
	
	@Test //teste!!
	public void abrirPagina() {
		driver.get(url); //abre a home do site da petz
		assertEquals("Pet Shop: Petz o maior pet shop do Brasil.", driver.getTitle()); //valida o titulo da pagina
	
	}
	
	

}
