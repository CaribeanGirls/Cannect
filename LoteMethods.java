package Methods;

import PageObjects.LocationObjects;
import PageObjects.LoteObjects;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static PageObjects.LocationObjects.wait;
import static Steps.Location.driver;

public class LoteMethods {
    public static void goToURL () {
        LoteObjects.driver = new ChromeDriver();
        LoteObjects.get(LocationObjects.baseURL);
        LoteObjects.driver.manage().window().maximize();
    }
    public static void Login () {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LoteObjects.elementingresoEmail)));
        LoteObjects.driver.findElement(LoteObjects.elementingresoEmail).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LoteObjects.elementingresoContrasena)));
        LoteObjects.driver.findElement(LoteObjects.elementingresoContrasena);
        LoteObjects.driver.findElement(LoteObjects.elementingresoContrasena).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoContrasena).sendKeys(LoteObjects.ingresoContrasena);
        LoteObjects.driver.findElement(LoteObjects.elementBotonSignIn).click();
    }
    public static void Home ()   {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LoteObjects.elementBotonHome)));
        LoteObjects.driver.findElement(LoteObjects.elementBotonHome).click();
        LoteObjects.driver.findElement(LoteObjects.elementBotonLotes1).click();
    }
    public static void Lotes () {
        LoteObjects.driver.findElement(LoteObjects.elementBotonLotes2). click();
        LoteObjects.driver.findElement(LoteObjects.elementBotonCrear).click();
    }
    public static void AltaLotes1 () {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LoteObjects.elementingresoNombre));
        LoteObjects.driver.findElement(LoteObjects.elementingresoNombre).sendKeys(LoteObjects.ingresoNombre);
        LoteObjects.driver.findElement(LoteObjects.elementDropDownTipo).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarCultivoGeneral).click();
        LoteObjects.driver.findElement(LoteObjects.elementDropDownSala).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarSalaAutomation).click();
        LoteObjects.driver.findElement(LoteObjects.elementDropDownSector).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarSectorAutomation).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarInicio).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarFechaInicio).click();
        LoteObjects.driver.findElement(LoteObjects.elementDropDownOrigen).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarSemillas).click();
        LoteObjects.driver.findElement(LoteObjects.elementDropDownGenetica).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarPampa).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoTerreno).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoTerreno).sendKeys(LoteObjects.ingresoTerreno);
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarCosecha).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarFechaCosecha).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoPeso).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoPeso).sendKeys(LoteObjects.ingresoPeso);
        LoteObjects.driver.findElement(LoteObjects.elementDropDownSexo).click();
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarMacho).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoSistema).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoSistema).sendKeys(LoteObjects.ingresoSistema);
        LoteObjects.driver.findElement(LoteObjects.elementingresoPlantasCrear).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoPlantasCrear).sendKeys(LoteObjects.ingresoPlantasCrear);
        LoteObjects.driver.findElement(LoteObjects.elementingresoCantSemillas).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoCantSemillas).sendKeys(LoteObjects.ingresoCantSemillas);
        LoteObjects.driver.findElement(LoteObjects.elementingresoNumPrecinto).click();
        LoteObjects.driver.findElement(LoteObjects.elementingresoNumPrecinto).sendKeys(LoteObjects.ingresoNumPrecinto);
    }
    public static void ChequeoAlta () {
        LoteObjects.driver.findElement(LoteObjects.elemenetBotonCrearLote).click();
    }
    public static void EditarLote () {
        LoteObjects.driver.findElement(LoteObjects.elementbotonEditar).click();
    }
    public static void ChequeoEditarLote () {
        LoteObjects.driver.findElement(LoteObjects.elementeditarNombre).sendKeys(LoteObjects.editarNombre);
        LoteObjects.driver.findElement(LoteObjects.elementbotonModificarTodo).click();
    }
    public static void IniciarBajaLote () {
        LoteObjects.driver.findElement(LoteObjects.elementbotonConfiguraciones).click();
    }
    public static void ContinuacionBajaLote () {
        LoteObjects.driver.findElement(LoteObjects.elementseleccionEliminar).click();
    }
    public static void DetallesBajaLote () {
        LoteObjects.driver.findElement(LoteObjects.elementingresarDesperdicio).sendKeys(LoteObjects.ingresarDesperdicio);
        LoteObjects.driver.findElement(LoteObjects.elementseleccionMotivo).click();
    }
    public static void ChequeoBajaLote () {
        LoteObjects.driver.findElement(LoteObjects.elementSeleccionarOtro).click();
        LoteObjects.driver.findElement(LoteObjects.elementbotonConfirmar).click();
    }
}
