package Methods;

import PageObjects.LocationObjects;
import PageObjects.LoteObjects;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static PageObjects.LocationObjects.wait;
import static Steps.Location.driver;

public class LocationMethods {

    public static void goToURL () {
        LocationObjects.driver = new ChromeDriver();
        LocationObjects.get(LocationObjects.baseURL);
        LocationObjects.driver.manage().window().maximize();
    }
    public static void Login () {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LocationObjects.elementingresoEmail)));
        LocationObjects.driver.findElement(LocationObjects.elementingresoEmail).click();
        LocationObjects.driver.findElement(LocationObjects.elementingresoEmail).sendKeys(LocationObjects.ingresoEmail);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LocationObjects.elementingresoContrasena)));
        LocationObjects.driver.findElement(LocationObjects.elementingresoContrasena).click();
        LocationObjects.driver.findElement(LocationObjects.elementingresoContrasena).sendKeys(LocationObjects.ingresoContrasena);
        LocationObjects.driver.findElement(LocationObjects.elementBotonSignIn).click();
    }
    public static void Home ()   {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LocationObjects.elementBotonHome)));
        LocationObjects.driver.findElement(LocationObjects.elementBotonHome).click();
        LocationObjects.driver.findElement(LocationObjects.elementBotonLugares).click();
    }
    public static void Location () {
        LocationObjects.driver.findElement(LocationObjects.elementBotonLocaciones).click();
        LocationObjects.driver.findElement(LocationObjects.elementBotonCrear).click();
    }
    public static void AltaLocacion1 () {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LocationObjects.elementNombreLoc)));
        LocationObjects.driver.findElement(LocationObjects.elementNombreLoc).sendKeys(LocationObjects.nombreLoc);
        LocationObjects.driver.findElement(LocationObjects.elementCodLoc).click();
        LocationObjects.driver.findElement(LocationObjects.elementCodLoc).sendKeys(RandomStringUtils.randomAlphanumeric(15));
        LocationObjects.driver.findElement(LocationObjects.elementContacto).click();
        LocationObjects.driver.findElement(LocationObjects.elementContacto).sendKeys(LocationObjects.Contacto);
        LocationObjects.driver.findElement(LocationObjects.elementEmailContacto).click();
        LocationObjects.driver.findElement(LocationObjects.elementEmailContacto).sendKeys(LocationObjects.ingresoEmailContacto);
        LocationObjects.driver.findElement(LocationObjects.elementTelfContacto).click();
        LocationObjects.driver.findElement(LocationObjects.elementTelfContacto).sendKeys(LocationObjects.ingresoTelfContacto);
        LocationObjects.driver.findElement(LocationObjects.elementseleccionPais).click();
        LocationObjects.driver.findElement(LocationObjects.elementbuscarPais).sendKeys(LocationObjects.buscarPais);
        LocationObjects.driver.findElement(LocationObjects.elementbuscarPais).click();
        LocationObjects.driver.findElement(LocationObjects.elementSeleccionarArgentina).click();
    }
    public static void AltaLocacion2 () {
        LocationObjects.driver.findElement(LocationObjects.elementseleccionProvincia).click();
        LocationObjects.driver.findElement(LocationObjects.elementbuscarProvincia).sendKeys(LocationObjects.buscarProvincia);
        LocationObjects.driver.findElement(LocationObjects.elementbuscarProvincia).click();
        LocationObjects.driver.findElement(LocationObjects.elementSeleccionarDistFed).click();
        LocationObjects.driver.findElement(LocationObjects.elementingresarDireccion).sendKeys(LocationObjects.ingresarDireccion);
        LocationObjects.driver.findElement(LocationObjects.elementbuscarDireccion).click();
    }
    public static void AltaLocacion3 () {
        LocationObjects.driver.findElement(LocationObjects.elementingresoCodPostal).sendKeys(LocationObjects.ingresoCodPostal);
        LocationObjects.driver.findElement(LocationObjects.elementingresoZonaHoraria).click();
        LocationObjects.driver.findElement(LocationObjects.elementbuscarZonaHoraria).sendKeys(LocationObjects.buscarZonaHoraria);
        LocationObjects.driver.findElement(LocationObjects.elementbuscarZonaHoraria).click();
        LocationObjects.driver.findElement(LocationObjects.elementseleccionarZonaHoraria).click();
    }
    public static void ChequeoDelAlta () {
        LocationObjects.driver.findElement(LocationObjects.elementbotonCrearLocacion).click();
    }
    public static void EditarLocacion () {
        LocationObjects.driver.findElement(LocationObjects.elementbotonEditar).click();
    }
    public static void ChequeoEditarLocacion () {
        LocationObjects.driver.findElement(LocationObjects.elementeditarNombre).sendKeys(LocationObjects.editarNombre);
        LocationObjects.driver.findElement(LocationObjects.elementbotonModificar).click();
    }
    public static void BajadeLocacion () {
        LocationObjects.driver.findElement(LocationObjects.elementbotonDesactivar).click();
        LocationObjects.driver.findElement(LocationObjects.elementseleccionMotivo).click();
    }
    public static void ChequeoDeBaja () {
        LocationObjects.driver.findElement(LocationObjects.elementSeleccionarOtro).click();
        LocationObjects.driver.findElement(LocationObjects.elementbotonConfirmar).click();
    }
}