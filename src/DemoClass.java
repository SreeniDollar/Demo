import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoClass {

	@Test
	public void login() {
		// TODO Auto-generated method stub
System.out.println("Welcome to Dell Inspiron 15 3000");
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
//ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
	}

}
