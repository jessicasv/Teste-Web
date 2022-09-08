package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lista extends PageObject{
	
	//@FindBy(xpath = "//h3[normalize-space()='Coleira Zee.Dog NeoPro Bubblegum Rosa para Cães']")
	//private WebElement produtoDesejado;
	
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/categoryid[1]/div[2]/div[2]/div[1]/h1[1]")
	WebElement textoResultado;
	

	public Lista(WebDriver driver) {
		super(driver);
	}
	
	public void clicarNoProduto(String produto) {
		//produtoDesejado.click();
		WebElement produtoDesejado = driver.findElement(By.xpath("//h3[normalize-space()='Coleira Zee.Dog NeoPro Bubblegum Rosa para Cães']"));
		produtoDesejado.click();
			
		
	}
	
	public String lerTextoResultados() {
		//substituido pelo findby- WebElement textoResultado = driver.findElement(By.cssSelector("h2Categoria.nomeCategoria"));
		return textoResultado.getText();
	}
	 
	
	

}
