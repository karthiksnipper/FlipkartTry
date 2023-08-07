package mock.stepdefinition;

import io.cucumber.java.en.*;

public class RemoveItemStepDefintions {
	
	@Given("Launch the flipkart App")
	public void launch_the_flipkart_App() {
	}

	@When("Search the product {string}")
	public void search_the_product(String string) {
	}

	@When("Select the product and add to cart {string}")
	public void select_the_product_and_add_to_cart(String string) {
	}

	@When("Place order, Select payment mode, Select delivery address")
	public void place_order_Select_payment_mode_Select_delivery_address() {
	}

	@Then("validate the item on the Cart {string}")
	public void validate_the_item_on_the_Cart(String string) {
	}

	@When("Remove the product from Cart")
	public void remove_the_product_from_Cart() {
	}

	@Then("Validate the message {string}")
	public void validate_the_message(String string) {
	}


}
