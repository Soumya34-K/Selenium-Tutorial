package Demo1;

import org.testng.annotations.Test;

public class TestNg2 {
	
  @Test(priority=0)  
  public void createCustomer() {
	  
	  System.out.println("Customer is created");
  } 
  
  @Test(priority=1)
  public void editCustomer() {
	  
	  System.out.println("Customer is edited");
  }
  
  @Test(enabled=false)
  public void ModifyCustomer() {
	  
	  System.out.println("Customer is Modified");
  }
  
  @Test(dependsOnMethods="editCustomer")
  public void deleteCustomer() {
	  
	  System.out.println("Customer is Deleted");
  }
  
}
