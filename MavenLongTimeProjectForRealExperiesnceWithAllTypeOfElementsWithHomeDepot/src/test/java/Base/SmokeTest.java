package Base;

import org.junit.Test;

import pages.HomePage;

public class SmokeTest extends BaseTest{
	HomePage hp;
	@Test
	public void myTest() {
		hp=new HomePage(driver);
		hp.verifyLogo();
		hp.isShoppingTerminalEnabled();
		hp.clickOn9HeaderLinks();
	}

}
