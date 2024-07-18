package package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_product_Page 
{
	WebDriver driver;
	@FindBy(id = "add-to-wishlist-button-submit")
	WebElement wishlist;
	@FindBy(xpath="(//a[@class='a-button-text a-text-center'])[1]")
	WebElement addtocart;
	@FindBy(linkText = "View Your List")
	WebElement viewlist;
	
	public void wishlisting()
	{
		wishlist.click();
	}
	public void viewWishList()
	{
		viewlist.click();
	}
	public void addingtocart()
	{
		addtocart.click();
	}
	public Amazon_product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
