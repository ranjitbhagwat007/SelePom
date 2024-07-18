package package1.SeleniumProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_CheckOut_Page 
{
	 WebDriver driver;
     @FindBy(linkText = "Proceed to checkout")
	 WebElement checkout_btn;
     @FindBy(xpath ="(//input[@type='radio'])[2]")
	 WebElement address_radio_btn;
     public void checkingout()
     {
    	 checkout_btn.click();
     }
     public void selecting_address()
     {
    	 address_radio_btn.click();
     }
   
   public Amazon_CheckOut_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
