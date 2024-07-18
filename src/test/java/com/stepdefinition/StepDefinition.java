package com.stepdefinition;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.PageObjectM.PageObject;
//import com.sun.tools.javac.util.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;
	PageObject pageObject;
	ExtentReports er;
	ExtentTest test;
	//@BeforeTest
//	public void testreport() {
//		//Trying to generate extent report
//		 er = new ExtentReports(System.getProperty("user.dir")+"/Report.html");
//		 test = er.startTest("Flexipill");
	//}
	@Given("I am on the search results page for Mobile Phones")
	public void shorting_Price() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		  
    // ____________Here i am creating the instance of PageObject class
		pageObject = new PageObject(driver); 
		
		//Trying to generate Extent Report
		//test.log(LogStatus.PASS, "I am on the search results page for Mobile Phones");
		
	}
	@When("I sort products by Price Low to High")
	public void navigate_to_searched_mobile() throws InterruptedException {
		
		pageObject.searchtext();
		Thread.sleep(2000);
		
	// ____Searching the mobile phone	
		
		pageObject.input_Text();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		pageObject.Short_LowToHigh();
		
		//Trying to generate Extent Report
		//test.log(LogStatus.PASS, "I sort products by Price Low to High");

		
	}
	@Then("the first product listed should be the one with the lowest price")
	public void lowestPrice() throws InterruptedException {
	   
		Thread.sleep(2000); 
	// ______fetching the lowest price of mobile_______
		List<WebElement> mobileprices = pageObject.PriceSpecificMobile();
		
		WebElement firstmobilePriceText = mobileprices.get(1);
		String FirstMobilePriceText = firstmobilePriceText.getText();
	      //System.out.println(FirstMobilePrice);
		String FirstMobilePrice = FirstMobilePriceText.substring(1);
		
   // _______changing the mobile price string to integer
		int MobilePrice = Integer.parseInt(FirstMobilePrice);
	    //System.out.println(MobilePrice);
		  
   //_________Fetching the lowest price and first mobile price
	    
	    boolean isLowestPrice = true;
	    
		for(WebElement prices : mobileprices) {
	        
		 String priceText = prices.getText();
			priceText  = priceText.substring(1);
			int Price = Integer.parseInt(priceText);
			
		 //System.out.println(Price);
			if(Price < MobilePrice) {
				isLowestPrice = false;
				break;
			}
		}
			if(isLowestPrice) {
				System.out.println("First Price listed  is the Lowest Price");
			}
			else {
				System.out.println("First Price listed is not the Lowest Price");
			}
			//Trying to generate Extent Report
			//test.log(LogStatus.PASS, "the first product listed should be the one with the lowest price");
	      
		          //System.out.println(lowestMobilePrice);
		          //Expected result ,this should be set to the value you expect
	              //String expectedLowestPrice = "₹545"; // Example expected price
	              //assertEquals(lowestMobilePrice, expectedLowestPrice);
	}
	
	
	@Given("I am on the product details page for a specifc phone")
	public void I_am_on_the_product_details_page_for_a_specifc_phone() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		pageObject = new PageObject(driver);
		
		//Trying to generate Extent Report
		//test.log(LogStatus.PASS, "I am on the product details page for a specific phone");
	}
	@When("I try to add the product to the cart with quantity_1")
	public void I_try_to_add_the_product_to_the_cart_with_quantity_1() throws InterruptedException {
		pageObject.searchtext();
		Thread.sleep(2000);
		pageObject.input_Text();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		pageObject.Short_LowToHigh();
		

		//Trying to generate Extent Report
		//test.log(LogStatus.PASS, "I try to add the product to the cart with quantity_1");
		
	}
	@Then("I should see an error message indicating invalid quantity")
	public void I_should_see_an_error_message_indicating_invalid_quantity() throws InterruptedException {
		//pageObject.SpecificMobile();
		
//		String parentid = driver.getWindowHandle();
//		
//		Set<String> allId = driver.getWindowHandles();
//		
//		String expected_title= "TARA MOBILE 309";
//		for (String id : allId)
//	     {
//	    	 driver.switchTo().window(id);
//	    
//	     if(driver.getTitle().equals(expected_title))
//	     {
//	    	break;
//	     }
//	     }
		
		Thread.sleep(2000); 
		// ______fetching specific  mobile_______
			List<WebElement> mobileprices = pageObject.PriceSpecificMobile();
			
			WebElement firstmobilePriceText = mobileprices.get(1);
			firstmobilePriceText.click();
		//Trying to generate Extent Report
			//test.log(LogStatus.PASS, "Scenario-2");
			
			//Trying to generate Extent Report
			//test.log(LogStatus.PASS, "I try to add the product to the cart with quantity_1");
			
	}
	
	@Given("I am on the search results page for Mens Watches")
	public void I_am_on_the_search_results_page_for_Mens_Watches() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		pageObject = new PageObject(driver);
		
	}
	@When("I iterate through the first 5 product pages on the search results")
	 public void I_iterate_through_the_frst_5_product_pages_on_the_search_results() throws InterruptedException {
		pageObject.searchtext();
		Thread.sleep(2000);
		pageObject.inputMensWatches();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
	}
	@Then("for each product page, I should be able to add the product to the wishlist")
	public void for_each_product_page_I_should_be_able_to_add_the_product_to_the_wishlist() throws InterruptedException {
         List<WebElement> getWatch = pageObject.Watches();
		 getWatch.get(0).click();
		 Thread.sleep(2000);
		 pageObject.CloseBtn();
//		
//		for(WebElement getAllWatch : getWatch) {
//			System.out.println(getAllWatch.getText());
//			Thread.sleep(2000);
//			getAllWatch.click();
//		}
		//Trying to generate Extent Report
			//test.log(LogStatus.PASS, "I should see an error message indicating invalid quantity");
	}
	
	@Given("I am on the search results page for Womens T-shirts")
	public void I_am_on_the_search_results_page_for_Womens_T_shirts(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		  
    // ____________Here i am creating the instance of PageObject class
		pageObject = new PageObject(driver);
		
		
		//Trying to generate Extent Report
		//test.log(LogStatus.PASS, "I am on the search results page for Womens T-shirts");
	
		
	}
	@When("I get all available color flter options and store them in an array")
	public void I_get_all_available_color_flter_options_and_store_them_in_an_array() throws InterruptedException {
		pageObject.searchtext();
		Thread.sleep(2000);
		pageObject.InputWomensTshirt();
		Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			
			//Trying to generate Extent Report
			//test.log(LogStatus.PASS, "I get all available color flter options and store them in an array");
		
	}
	@Then("I should be able to randomly select a color from the array and apply the flter")
	public void I_should_be_able_to_randomly_select_a_color_from_the_array_and_apply_the_flter() throws InterruptedException {
		 // Scroll to the color filter section
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        pageObject.ColorSection();
        Thread.sleep(2000);
        pageObject.moreColor();
        Thread.sleep(2000);
        // Get all available color filter options
       
        List<WebElement> colorOptions =  pageObject.color_OptionList();

        // Store color options in an array
        WebElement[] colorArray = new WebElement[colorOptions.size()];
        colorOptions.toArray(colorArray);
        //System.out.println(colorOptions);

        // Select a random color filter from the array and apply it
        Random random = new Random();
        int randomIndex = random.nextInt(colorArray.length);
        WebElement randomColor = colorArray[randomIndex];
        randomColor.click();

       
        //Trying to generate Extent Report
	    //test.log(LogStatus.PASS, "I should be able to randomly select a color from the array and apply the flter");
    
          
		
	}
	
	@Given("I am on the product details page for a specifc T-shirt")
	public void I_am_on_the_product_details_page_for_a_specifc_T_shirt() {
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		  
    // ____________Here i am creating the instance of PageObject class
		pageObject = new PageObject(driver);   
		

        //Trying to generate Extent Report
	    //test.log(LogStatus.PASS, "I am on the product details page for a specifc T-shirt");
		
	}
	@When("I add the T-shirt to the cart with quantity 2")
	public void I_add_the_T_shirt_to_the_cart_with_quantity_2() throws InterruptedException {
		 // Search for T-shirts
		Thread.sleep(2000);
		pageObject.InputTshirt();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
        // Select a specific T-shirt from the search results
        List<WebElement> listOfTshit = pageObject.searchSpecificTsirt();
                 WebElement specificTshirt = listOfTshit.get(0);
                 specificTshirt.click();
        Thread.sleep(2000);
        //pageObject.addToCartSpecificTshirt();
       // Thread.sleep(2000);
        //Trying to generate Extent Report
	    //test.log(LogStatus.PASS, "I add the T-shirt to the cart with quantity 2");
	}
	@Then("I navigate to the cart page")
	public void I_navigate_to_the_cart_page() throws InterruptedException {
		Thread.sleep(2000);
		pageObject.navigateToCart();
		Thread.sleep(2000);
//		 //Trying to generate Extent Report
//	    test.log(LogStatus.PASS, "I navigate to the cart page");
		
	}
	@And("the cart should display the T-shirt with a quantity of 2 assuming a collection stores cart items")
	public void the_cart_should_display_the_T_shirt_with_a_quantity_of_2() {
//		//Trying to generate Extent Report
//		test.log(LogStatus.PASS, "the cart should display the T-shirt with a quantity of 2 assuming a collection stores cart items");
//		
	}
//	@AfterTest
//	public void close() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
//	}
	
}
