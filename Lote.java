package Steps;

import PageObjects.LoteObjects;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lote {

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
        Methods.LoteMethods.goToURL();

        //Login
        Thread.sleep(1000);
        Methods.LoteMethods.Login();

        //Home
        Thread.sleep(10000);
        Methods.LoteMethods.Home();

        //Lotes
        Thread.sleep(1000);
        Methods.LoteMethods.Lotes();

        //AltaLotes1
        Thread.sleep(30000);
        Methods.LoteMethods.AltaLotes1();

        //ChequeoAlta
        Methods.LoteMethods.ChequeoAlta();

        //EditarLote
        Thread.sleep(50000);
        Methods.LoteMethods.EditarLote();

        //ChequeoEditarLote
        Thread.sleep(20000);
        Methods.LoteMethods.ChequeoEditarLote();

        //IniciarBajaLote
        Thread.sleep(30000);
        Methods.LoteMethods.IniciarBajaLote();

        //ContinuacionBajaLote
        Thread.sleep(2000);
        Methods.LoteMethods.ContinuacionBajaLote();

        //DetallesBajaLote
        Thread.sleep(4000);
        Methods.LoteMethods.DetallesBajaLote();

        //ChequeoBajaLote
        Thread.sleep(4000);
        Methods.LoteMethods.ChequeoBajaLote();
    }
    private static void waitVisibility(WebElement ingresoNombre){}


    @After
    public void cerrarNavegador() {
        driver.quit();
    }
}