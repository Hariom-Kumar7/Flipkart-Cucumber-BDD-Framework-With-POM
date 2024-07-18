package com.PageObjectM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver;
//public PageObject(WebDriver driver) {
//		super();
//		this.driver = driver;
//		this.searchbox = searchbox;
//		this.inputText = inputText;
//		PageFactory.initElements(driver, this);
//	}

//WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
           
	 @FindBy(xpath = "//input[@type='text']")   // This xpath is releted to search bar
	 private WebElement searchbox;
	 @FindBy(xpath = "//input[@type='text']")
	 private WebElement inputText;
	 @FindBy(xpath = "(//div[@class='zg-M3Z'])[2]") // This is for shorting low to high
	 private WebElement shortLow_To_High;
	 @FindBy(xpath = "(//*[@class ='Nx9bqj'])")   // This x path for lowest price for first product
	 private List<WebElement> FirstspecificPhone;
	 //Locator for searching the Men's Watches
	 @FindBy(xpath = "//input[@type='text']")
	 private WebElement inputTextMensWathes;
	 //Locator for list of watches
	 @FindBy(xpath = "//*[@class ='N1bADF' ]")
	 private List<WebElement> watches;
	 //Locator for closing the login window
	 @FindBy(xpath ="//*[@class = 'QqFHMw NEEcDr']")
	 private WebElement closeLoginWindow;
	 //Locator for searching the Women's T-shirt 
	 @FindBy(xpath = "//input[@type='text']")
	 private WebElement inputWomenT_shirt;
	 //Locator for finding the women's T-shirt from the list of multiple t-shirt
	 @FindBy(xpath = "//*[@class='_53J4C-']")
	 private List<WebElement> getWTshirt;
	 //Locator for Women's T-shirt color filter
	 @FindBy(xpath = "(//*[@class = 'ukzDZP'])[8]")
	 private WebElement colorsection;
	 // Locator for click on more color
	 @FindBy(xpath = "//*[@class = 'e+xvXX KvHRYS']")
	 private WebElement moreColor;
	 //Locator for List of color
	 @FindBy(xpath = "//*[@class = '_6i1qKy']")
	 private List<WebElement> ListcolorOption;
	 //Locator for searching the t-shirt
	 @FindBy(xpath = "//input[@type='text']")
	 private WebElement inputTextT_shirt;
	 // Locating the specific t-shirt
	 @FindBy(xpath = "//*[@class = 'WKTcLC']")
	 private List<WebElement> specificTshirt;
	 //Locator for adding to cart the specific t-shirt
	 @FindBy(xpath = "//*[@class = 'QqFHMw vslbG+ In9uk2']")
	 private WebElement addtocart_Tshirt;
	 //Locator for navigating the Cat
//	 @FindBy(xpath = "//span[text() = 'Cart']")
	 @FindBy(xpath = "//*[@class = 'GAbRIN']")
	 private WebElement navigateCart;
	 
	 //Method for search field
	 public void searchtext() {
		 this.searchbox.click();
	 }
	 //Method for Searching the Mobile Phone
	 public void input_Text() {
		 this.inputText.sendKeys("Mobile Phone");
	 }
	 //Method for shorting the mobile phone low to high
	 public void Short_LowToHigh() {
		 this.shortLow_To_High.click();
		 
	 }
	 //Method for finding the specific mobile phone
	 public List<WebElement>PriceSpecificMobile() {
		
		 return FirstspecificPhone;
		 //this.FirstspecificPhone.getText();
//		WebElement firstmobilePrice = FirstspecificPhone.get(1);
//		String FirstMobilePrice = firstmobilePrice.getText();
//		
//		System.out.println(FirstMobilePrice);
	 }
	 // Method for searching the Men's Watches
	 public void inputMensWatches() {
		 this.inputTextMensWathes.sendKeys("Mens Watches");
	 }
	 //Method for find the list of watch
	 public List<WebElement> Watches() {
		 return watches;
	 }
	 //Method for closing the login window
	 public void CloseBtn() {
		 this.closeLoginWindow.click();
	 }
	 //Method for searching the Women's T-shirt
	 public void InputWomensTshirt() {
		 this.inputWomenT_shirt.sendKeys("Women's T-shirt");
	 }
	 //Method for finding the list of Women's T-shirt
	 public List<WebElement> womenTshirt() {
		 return womenTshirt();
	 }
	 //Method for click on color section which is in the women's t-shirt page
	 public void ColorSection() {
		 this.colorsection.click();
	 }
	 //Method for click on the more color
	 public void moreColor() {
	     this.moreColor.click();
	}
	 //Method for finding the list of Women's T-shirt color
	 public List<WebElement> color_OptionList() {
		 return ListcolorOption;
	 }
	 //Method for searching the T-Shirt
	 public void InputTshirt() {
		 this.inputTextT_shirt.sendKeys("T-Shirt");
	 }
	 //Method for searching the specific T-Shirt
	 public List<WebElement> searchSpecificTsirt(){
		  return specificTshirt; 
	 }
	 //Method for adding the add to cart specific t-shirt
	 public void addToCartSpecificTshirt() {
		 this.addtocart_Tshirt.click();
	 }
	 //Method for navigate to cart
	 public void navigateToCart() {
		 this.navigateCart.click();
	 }
}
