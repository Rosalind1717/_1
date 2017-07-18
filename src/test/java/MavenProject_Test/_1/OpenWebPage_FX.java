package MavenProject_Test._1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;


public class OpenWebPage_FX {
	WebDriver driver;
  @Test
  public void test_case2(){
	  //System.setProperty("webdriver.firefox.bin", "D:\\Project Documents\\CT_Env\\geckodriver\\geckodriver.exe");  
	  driver = new FirefoxDriver();  
	  driver.navigate().to("http://www.baidu.com");   
      System.out.println("1 Page title is: " + driver.getTitle());  
 
      WebElement element = driver.findElement(By.id("kw"));  


      element.sendKeys("Tim Roth");  


      element.submit();  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Page title is: " + driver.getTitle());
	  driver.quit();
  }

}
