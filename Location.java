package Steps;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class Location {

    //Variables
    public static WebDriver driver;
    private static final String TIPO_DRIVER = "webdriver.chrome.driver";
    private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver2.exe";
    private String URL = "https://uat.cannect.com.ar/locations";

    public static void click(WebElement element) {
        element.click();
    }

    @Before
    public static <Webelement> void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver2.exe");


        //goToURL
        WebDriverWait wait = new WebDriverWait(driver, (20));
        Methods.LocationMethods.goToURL();

        //Login
        Methods.LocationMethods.Login();

        //Home
        Thread.sleep(10000);
        Methods.LocationMethods.Home();

        //Location
        Thread.sleep(1000);
        Methods.LocationMethods.Location();

        //AltaLocacion1
        Thread.sleep(4000);
        Methods.LocationMethods.AltaLocacion1();

        //AltaLocacion2
        Thread.sleep(5000);
        Methods.LocationMethods.AltaLocacion2();

        //AltaLocacion3
        Thread.sleep(4000);
        Methods.LocationMethods.AltaLocacion3();

        //ChequeoDelAlta
        Methods.LocationMethods.ChequeoDelAlta();

        //EditarLocacion
        Thread.sleep(1000);
        Methods.LocationMethods.EditarLocacion();

        //ChequeoEditarLocacion
        Thread.sleep(4000);
        Methods.LocationMethods.ChequeoEditarLocacion();

        //BajadeLocacion
        Thread.sleep(4000);
        Methods.LocationMethods.BajadeLocacion();

        //ChequeoDeBaja
        Thread.sleep(4000);
        Methods.LocationMethods.ChequeoDeBaja();
    }


    private static void waitVisibility(WebElement ingresoNombre){}
};
