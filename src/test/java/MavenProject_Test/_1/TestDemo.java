package MavenProject_Test._1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestDemo {
  @Test
  public void test_case2() {
	  System.out.println("this is TestNG test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before class");// information in Before Method
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after class");
  }

}
