package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant {
	public WebDriver driver;
@BeforeMethod
public void openapp(String url)
{
	//System.setProperty(GECKO_KEY,GECKO_VALUE);
	 driver=new FirefoxDriver();
	driver.get(url);
}

@AfterMethod
public void cloaseapp()
{
	driver.close();
}

}
