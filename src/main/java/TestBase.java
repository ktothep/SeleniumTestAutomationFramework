

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;
public static void initialisation()
{   System.setProperty("webdriver.chrome.driver","//users//karanprinja//desktop//chromedriver");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
}
public static void quit()
{
	driver.quit();
}
}
