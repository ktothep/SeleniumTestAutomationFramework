import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOM extends TestBase {

@FindBy(xpath=".//*[@name='userName']")
WebElement username;

@FindBy(xpath=".//*[@name='password']")
WebElement password;

@FindBy(xpath=".//*[@name='login']")
WebElement loginbutton;

public HomepagePOM()
{
	PageFactory.initElements(driver,this);
}


public void login()
{
	 username.sendKeys("test");
	 password.sendKeys("test");
	 loginbutton.click();
	
}
public String getTitle()
{
	return driver.getTitle();
	
}
}
