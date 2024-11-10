package MultipleUsersLoggedIn;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;



public class codeAgentPanel {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private JavascriptExecutor js;

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    js = (JavascriptExecutor) driver;
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get(baseUrl + "chrome://newtab/");
	    driver.get("https://uat4.slashrtc.in/index.php/login");
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("Demo");
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("DemoUserAT");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Automation@123");
	    driver.findElement(By.id("loginProcess")).click();
	    driver.get("https://uat4.slashrtc.in/index.php/site/");
	    driver.findElement(By.xpath("//div[@id='phoneNotRegisterError']/div/button")).click();
	    driver.findElement(By.xpath("//div[@id='offlineScreenHeaderheight']/div/div[2]/div/button")).click();
	    driver.findElement(By.xpath("//ul[@id='callingDataCustInfo']/li[2]/h3")).click();
	    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
	    driver.findElement(By.id("Data9b8b8592-5e2d-478e-8e52-3e64068b77cc")).click();
	    driver.findElement(By.id("Data7610493b-9743-418e-a49c-75089ea0b931")).click();
	    driver.findElement(By.id("Data646e6d01-8444-4105-a907-8885cd27e1d0")).click();
	    driver.findElement(By.id("Data646e6d01-8444-4105-a907-8885cd27e1d0")).clear();
	    driver.findElement(By.id("Data646e6d01-8444-4105-a907-8885cd27e1d0")).sendKeys("abc");
	    driver.findElement(By.id("processInfoListBox")).click();
	    driver.findElement(By.id("Data17d25539-65c5-48e3-8667-394abb6501a1")).click();
	    driver.findElement(By.xpath("//div[@id='contactInfoBox']/div[3]")).click();
	    driver.findElement(By.id("processInfoListBox")).click();
	    driver.findElement(By.id("Data9b8b8592-5e2d-478e-8e52-3e64068b77cc")).click();
	    driver.findElement(By.id("Data9b8b8592-5e2d-478e-8e52-3e64068b77cc")).clear();
	    driver.findElement(By.id("Data9b8b8592-5e2d-478e-8e52-3e64068b77cc")).sendKeys("5");
	    driver.findElement(By.id("Data17d25539-65c5-48e3-8667-394abb6501a1")).click();
	    driver.findElement(By.id("Data17d25539-65c5-48e3-8667-394abb6501a1")).clear();
	    driver.findElement(By.id("Data17d25539-65c5-48e3-8667-394abb6501a1")).sendKeys("PAY20");
	    driver.findElement(By.id("Data7610493b-9743-418e-a49c-75089ea0b931")).click();
	    driver.findElement(By.id("Data7610493b-9743-418e-a49c-75089ea0b931")).clear();
	    driver.findElement(By.id("Data7610493b-9743-418e-a49c-75089ea0b931")).sendKeys("Dept4");
	    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
	    driver.findElement(By.xpath("//div[@id='previewTimerButtonDiv']/div/div/button")).click();
	    driver.findElement(By.xpath("//div[@id='callButton']/div[2]/button")).click();
	    driver.findElement(By.xpath("//div[@id='callingDataHeader']/div/div[4]/div/button")).click();
	    driver.findElement(By.xpath("//img[contains(@src,'https://uat4.slashrtc.in/assets/advImg/dashboard2.svg')]")).click();
	    driver.findElement(By.xpath("//div[@id='logoutStateUpdateBox']/a/span/i")).click();
	    driver.get("https://uat4.slashrtc.in/index.php/login/logout");
	    driver.get("https://uat4.slashrtc.in/index.php/login");
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
