
@tag
Feature: Flipkart Product Listing and Cart
#Background:



  @tag1
  Scenario: Verify product sorting by price Low to Hig 
    Given I am on the search results page for Mobile Phones
    When I sort products by Price Low to High
    Then the first product listed should be the one with the lowest price

  @tag2
   Scenario: Add invalid quantity to cart
    Given I am on the product details page for a specifc phone
    When I try to add the product to the cart with quantity_1
    Then I should see an error message indicating invalid quantity

  @tag3
   Scenario: Iterate through product pages and add to wishlist 
   Given I am on the search results page for Mens Watches
   When I iterate through the first 5 product pages on the search results
   Then for each product page, I should be able to add the product to the wishlist
    
  @tag4
   Scenario: Select random color flter from available options 
    Given I am on the search results page for Womens T-shirts
    When I get all available color flter options and store them in an array
    Then I should be able to randomly select a color from the array and apply the flter

   
  @tag5
   Scenario: Verify cart items maintain quantity after adding multiples 
    Given I am on the product details page for a specifc T-shirt
    When I add the T-shirt to the cart with quantity 2
    Then I navigate to the cart page
    And the cart should display the T-shirt with a quantity of 2 assuming a collection stores cart items

