package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage extends BaseTest {
	public void verfiytitle(String title)
	{
		try{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			Assert.assertEquals(title,"title1");
		}
		
	}
		
		public void  verfiyelement(WebDriver element)
		{
			try{
				WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOf(element));
				}
				catch(Exception e)
				{
					Assert.assertEquals(element,"title1");
				}
		}
	

}
