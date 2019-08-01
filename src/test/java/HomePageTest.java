

import java.io.IOException;

import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class HomePageTest extends TestBase {
public static HomepagePOM hp;



@BeforeTest
public void setup()
{
	initialisation();
	hp=new HomepagePOM();
}

@Test
public void login()
{
	hp.login();
}
@Test
public void title() throws IOException
{
	//ExcelUtils.workbookopen();
	//ExcelUtils.writeworkbokk();
}

@AfterTest
public void teardown()
{
	quit();
}
}
