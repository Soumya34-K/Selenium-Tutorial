package FirstTestNGPackage;

import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	   public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath ="E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe"
	    public WebDriver driver ; 
	    
  @Test
  public void verifyHomepageTitle() {
	  
	  System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
	  
  }
}
