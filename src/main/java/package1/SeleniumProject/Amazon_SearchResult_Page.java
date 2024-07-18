package package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page 
{
	 WebDriver driver;
     @FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	 WebElement shoe1;

     public void selcting_1st_product()
     {
    	 shoe1.click();
     }
   
   public Amazon_SearchResult_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
