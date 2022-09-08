package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject {
	@FindBy(id = "search") //atributo caixa de pesquisa
	private WebElement busca;

	//construtor
	public Home(WebDriver driver) {
		super(driver);
	}
	
	//metodo
	public void buscarProdutoComEnter(String produto) {
		busca.clear();
		busca.sendKeys(produto + Keys.ENTER);
		
	}
	
	

}
