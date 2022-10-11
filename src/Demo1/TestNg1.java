package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg1 {
	
@BeforeClass
	  public void OpenBrowser() {
		  
		  System.out.println("Open the browser");
	  }
@BeforeMethod
	  public void Login() {
		  
	System.out.println("Login ");
	  }

  @Test
  public void createCustomer() {
	  
	  System.out.println("Customer is created");
  }
  
  @Test
  public void deleteCustomer() {
	  
	  System.out.println("Customer is Deleted");
  }

  @Test
  public void editCustomer() {
	  
	  System.out.println("Customer is edited");
  }
  
  @AfterMethod
  public void Logout() {
	  
	  System.out.println("Logout");
  }
  
  @AfterClass
  public void CloseBrowser() {
	  
	  System.out.println("Closed the browser");
  }
}
