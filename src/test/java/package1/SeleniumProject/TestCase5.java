package package1.SeleniumProject;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(package1.SeleniumProject.Listener.class)
public class TestCase5 extends Listener
{
	@Test
	public void login_to_amazon()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Amazon_Login_Page a=new Amazon_Login_Page(driver);
		a.un();
		a.continue_click();
		a.pwd();
		a.signin();
		
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.searching();
		
		Amazon_SearchResult_Page a2=new Amazon_SearchResult_Page(driver);
		a2.selcting_1st_product();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> p_cid= s1.iterator();
		String p_id=p_cid.next();
		String c_id=p_cid.next();
		driver.switchTo().window(c_id);
		
		Amazon_product_Page a3=new Amazon_product_Page(driver);
		a3.wishlisting();
		a3.viewWishList();
		a3.addingtocart();
		
		Amazon_CheckOut_Page a4=new Amazon_CheckOut_Page(driver);
		a4.checkingout();
		a4.selecting_address();
		//assertion
		assertTrue(a4.address_radio_btn.isSelected());
	}
}