package MultipleUsersLoggedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class multiUsersLoggedIn {

	public static void main(String[] args) {
		// List of username-password pairs
		List<String[]> credentials = new ArrayList<>();
		credentials.add(new String[] { "username1", "password1" });
		credentials.add(new String[] { "username2", "password2" });

		WebDriver driver = null;

		try {
			driver = new ChromeDriver();
			for (String[] credential : credentials) {
				String username = credential[0];
				String password = credential[1];
				driver.get("url_of_your_application");
				WebElement usernameField = driver.findElement(By.id("username"));
				WebElement passwordField = driver.findElement(By.id("password"));
				WebElement loginButton = driver.findElement(By.id("login_button"));
				usernameField.sendKeys(username);
				passwordField.sendKeys(password);
				loginButton.click();
				

			}
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}
	}
}
