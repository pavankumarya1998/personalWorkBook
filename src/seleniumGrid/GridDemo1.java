package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo1 {
public static void main(String[] args) throws MalformedURLException {
	ChromeOptions options = new ChromeOptions();
	options.setCapability("se:downloadsEnabled", true);
	options.setCapability("gsg:customcap", true);
	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
	driver.get("https://selenium.dev");
	
	
	
}

}
