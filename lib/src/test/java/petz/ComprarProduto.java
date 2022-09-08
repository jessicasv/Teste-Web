package petz;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Home;
import pages.Lista;


public class ComprarProduto {
	
	String url; //endereco do site alvo
	WebDriver driver; //objeto do selenium webdriver
	
	Home home; //objeto home herda classe home
	Lista lista; //objeto lista herda classe lista
	
	@Before //antes do teste
	public void iniciar() {
		url = "https://www.petz.com.br";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximiza o browser
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS); 
		
		home = new Home(driver); //instancia a pagina
		lista = new Lista(driver);
	}
	
	@After //depois do teste
	public void finalizar() {
		driver.quit();
	}
	
	
	@Dado("que acesso o site Petz")
	public void que_acesso_o_site_petz() {
		driver.get(url); //abre o site petz
		System.out.println("Passo 1");

	}

	@Quando("busco por {string} e pressiono Enter")
	public void busco_por_e_pressiono_enter(String produto) {
		home.buscarProdutoComEnter(produto);
		System.out.println("Passo 2");
		

	}

	@Então("exibe uma lista de produtos relacionados a {string}")
	public void exibe_uma_lista_de_produtos_relacionados_a(String produto) {
		assertEquals("RESULTADOS PARA \"" + produto.toUpperCase() + "\"", lista.lerTextoResultados());
		System.out.println("Passo 3");

	}

	@Quando("escolho o primeiro {string}")
	public void escolho_o_primeiro(String produto) {
		lista.clicarNoProduto(produto);
		System.out.println("Passo 4");

	}

	@Então("exibe para {string} o preço de {string}")
	public void exibe_para_o_preço_de(String produto, String string2) {
		System.out.println("Passo 5");

	}


}
