import com.sun.corba.se.impl.orb.ParserTable;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: fjodorekstrom
 * Date: 3/14/13
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultiplierTests {
    @Test
    public void test2x2Is4() {
        Multiplier multiplier = new Multiplier();
        assertTrue(multiplier.multiply(2, 2) == 4);
    }

    @Test
    public void test2x2IsNot3() {
    	Multiplier multiplier = new Multiplier();
    	assertTrue(multiplier.multiply(1, 3) == 3);
    }

    @Test
    public void webdriver() {
    	WebDriver driver = new FirefoxDriver();
    	driver.get("http:www.google.com/");
    	assertTrue(driver.getTitle().equals("Google"));
    	driver.quit();
    }
}
