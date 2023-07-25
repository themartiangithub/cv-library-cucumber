package uk.co.library.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import uk.co.library.utility.Utility;
import uk.co.library.propertyreader.PropertyReader;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
