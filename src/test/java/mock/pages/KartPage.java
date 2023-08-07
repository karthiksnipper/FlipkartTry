package mock.pages;

import java.util.List;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mock.baseclass.BaseClass;

public class KartPage extends BaseClass {
	public KartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className  = "_3704LK")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getRedmiPhantomWhite256() {
		return redmiPhantomWhite256;
	}

	public WebElement getPincodeBox() {
		return pincodeBox;
	}

	public WebElement getAddCartButton() {
		return addCartButton;
	}

	public WebElement getAddedRedmiPhantomWhite256() {
		return addedRedmiPhantomWhite256;
	}

	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public WebElement getDeliveryToRadioButton() {
		return deliveryToRadioButton;
	}

	public WebElement getDeliveryHereButton() {
		return deliveryHereButton;
	}
	@FindBy(className  = "L0Z3Pu")
	private WebElement searchButton;
	
	@FindBy(xpath   = "//div[@class='_4rR01T'][text()='Redmi Note 11 PRO Plus 5G (PHANTOM WHITE, 256 GB)']")
	private WebElement redmiPhantomWhite256;
	
	@FindBy(id  = "pincodeInputId")
	private WebElement pincodeBox;
	
	@FindBy(className  = "_2KpZ6l _2U9uOA _3v1-ww")
	private WebElement addCartButton;
	
	@FindBy(xpath  = "//a[@class='_2Kn22P gBNbID'][text()='Redmi Note 11 PRO Plus 5G (PHANTOM WHITE, 256 GB)']")
	private WebElement addedRedmiPhantomWhite256;
	
	@FindBy(xpath  = "//span[text()='Place Order']")
	private WebElement placeOrderButton;
	
	@FindBy(xpath  = "//div[@class='_1XFPmK'] /following-sibling::div/child::*/child::*/child::p/child::*[text()='Satish Raja']")
	private WebElement deliveryToRadioButton;
	
	@FindBy(xpath  = "//*[text()='Deliver Here']")
	private WebElement deliveryHereButton;
	
	
	
	public void searchTheProduct(String productName) {
		elementInsertValue(searchBox, productName );
		elementClick(searchButton);
	}
	
	public void selectAddToCart() {
		enterApplUrl("https://www.flipkart.com/");
		insertValueByJs (searchBox, "Redmi Note 11 PRO Plus 5G" );
		elementClick(searchButton);
		String parentWin = driver.getWindowHandle();
		elementClick(addCartButton);
		Set<String> allWindows = driver.getWindowHandles();
		List <String> nextWin =new LinkedList<String>();
		for(String x : allWindows) {
		if(!parentWin.equalsIgnoreCase(driver.getWindowHandle())){
			nextWin.add(x);       
		}}
	System.out.println(nextWin);
	List <String> orderString = new LinkedList<String>(allWindows);
	driver.switchTo().window(orderString.get(1));
	}
	
	public void 
	
	}
	
	
	
