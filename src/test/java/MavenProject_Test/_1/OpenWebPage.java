package MavenProject_Test._1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class OpenWebPage {

	WebDriver driver;
	
	@Test
  public void test_case1() {
	ChromeOptions options=new ChromeOptions();
	//options.addArguments("--test-type","--ignore-certificate-errors");
	  options.addArguments("--user-data-dir=C:/Users/Administrator/AppData/Local/Google/Chrome/User Data/Default");
	  System.setProperty("webdriver.chrome.driver","D:\\Project Documents\\CT_Env\\chromedriver_2_3\\chromedriver.exe");
	   driver = new ChromeDriver(options);
	   driver.get("http://www.baidu.com");
	   WebElement element = driver.findElement(By.id("kw"));
	   element.sendKeys("hello Selenium!");
	   element.submit();
	  }
	
 /* public void test_case2() {

	  System.setProperty("webdriver.firefox.marionette", "D:\\Project Documents\\CT_Env\\geckodriver\\geckodriver.exe");  
	        // 创建一个 FireFox 的浏览器实例  
	  driver = new FirefoxDriver();  
	  
	        // 让浏览器访问 
	  //driver.get("http://www.baidu.com");  
	        // 用下面代码也可以实现  
	        driver.navigate().to("http://www.baidu.com");  
	  
	        // 获取 网页的 title  
	  System.out.println("1 Page title is: " + driver.getTitle());  
	  
	        // 通过 id 找到 input 的 DOM  
	  WebElement element = driver.findElement(By.id("kw"));  
	  
	        // 输入关键字  
	  element.sendKeys("zTree");  
	  
	        // 提交 input 所在的  form  
	  element.submit();  
	          
	        // 通过判断 title 内容等待搜索页面加载完毕，Timeout 设置10秒  
	        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {  
	            public Boolean apply(WebDriver d) {  
	                return d.getTitle().toLowerCase().endsWith("ztree");  
	            }  
	        });  
	  
	        // 显示搜索结果页面的 title  
	        System.out.println("2 Page title is: " + driver.getTitle());  
	          
	        //关闭浏览器  
	        driver.quit();  
	    }  */


  public void f() {
	  
	
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
