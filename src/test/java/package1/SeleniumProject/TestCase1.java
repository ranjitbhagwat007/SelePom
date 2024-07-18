package package1.SeleniumProject;

import static org.testng.Assert.*;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(package1.SeleniumProject.Listener.class)
public class TestCase1 extends Listener
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
		
		assertEquals(a1.search_tf.getDomAttribute("value"), "shoe");
	}
}