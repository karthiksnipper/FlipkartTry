Feature: Verifying Flipkart Orders

Scenario: Existing customer place the order and remove product from CART
    Given Launch the flipkart App
    When Search the product "redmi note 11 pro"
    And Select the product and add to cart "600020"
    And Place order, Select payment mode, Select delivery address 
    Then validate the item on the Cart "Redmi Note 11 PRO Plus 5G (PHANTOM WHITE, 256 GB)"
    When Remove the product from Cart
    Then Validate the message "Your cart is empty!"
    
    
   