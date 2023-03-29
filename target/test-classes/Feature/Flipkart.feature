@Flipkart
Feature: To check place order funtionality in Flipkart

  Scenario: User should login Flipkart application
    Given User enters Into walnut section
    When User selects Farmley Cashews 500g
    And User clicks Go to cart option
    And User click Place order
    And User navigates back 
    And User Clicks Remove
    Then Your cart is empty page is displayed
    
