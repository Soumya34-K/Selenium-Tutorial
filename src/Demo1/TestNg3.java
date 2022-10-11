package Demo1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg3 {

	@Test
	public void createCustomer() {

		System.out.println("Customer is created");
	}

	@Test
	public void editCustomer() {
		String actual = "ABCD";
		String expected = "ABC";
		Assert.assertEquals(actual, expected);
		System.out.println("Customer is edited");
	}

	@Test
	public void ModifyCustomer() {

		System.out.println("Customer is Modified");
	}

	@Test(dependsOnMethods = "editCustomer")
	public void deleteCustomer() {

		System.out.println("Customer is Deleted");
	}
}
