package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class LocationObjects {

    public static ChromeDriver driver;
    public static Instant wait;

    public static void get(String baseURL) {
    }
    public static String baseURL = "https://uat.cannect.com.ar/locations";
    public static By elementingresoEmail = By.xpath("//input[@autocomplete='new-email']");
    public static String ingresoEmail = "sherazo@itpatagonia.com";
    public static By elementingresoContrasena = By.xpath("//*[@autocomplete='new-password']");
    public static String ingresoContrasena = "Baires2023*";
    public static By elementBotonSignIn = By.xpath("//*[@aria-hidden='true']");
    public static By elementBotonHome = By.xpath(".//button[@icon='pi pi-bars']");
    public static By elementBotonLugares = By.xpath("//span[contains(text(),'Lugares')]");
    public static By elementBotonLocaciones = By.xpath("//span[contains(text(),'Locaciones')]");
    public static By elementBotonCrear = By.xpath("//*[@routerlink='/locations/create']");
    public static By elementNombreLoc = By.id("name");
    public static String nombreLoc = "Pampa";
    public static By elementCodLoc = By.id("code");
    public static String ingresoCodigo = "RandomStringUtils.randomAlphanumeric(15)";
    public static By elementContacto = By.id("contact_name");
    public static String Contacto = "Antonio";
    public static By elementEmailContacto = By.id("contact_email");
    public static  String ingresoEmailContacto = "sherazo@itpatagonia.com";
    public static By elementTelfContacto = By.id("contact_phone");
    public static String ingresoTelfContacto = "1122334455";
    public static By elementseleccionPais = By.id("country");
    public static By elementbuscarPais = By.xpath("//*[@aria-activedescendant='p-highlighted-option']");
    public static String buscarPais = "arg";
    public static By elementSeleccionarArgentina = By.xpath("//*[@aria-label='Argentina']");
    public static By elementseleccionProvincia = By.xpath("//*[@id='province']");
    public static By elementbuscarProvincia = By.xpath("//*[@aria-activedescendant='p-highlighted-option']");
    public static String buscarProvincia = "dist";
    public static By elementSeleccionarDistFed = By.xpath("//*[contains(text(),'Distrito Federal')]");
    public static By elementingresarDireccion = By.xpath("//*[@aria-describedby='address-help']");
    public static String ingresarDireccion = "laprida 1425";
    public static By elementbuscarDireccion = By.xpath("//*[@icon='pi pi-search']");
    public static By elementingresoCodPostal = By.id("postal_code");
    public static String ingresoCodPostal = "1126";
    public static By elementingresoZonaHoraria = By.xpath("//*[@formcontrolname='time_zone']");
    public static By elementbuscarZonaHoraria = By.xpath("//*[@aria-activedescendant='p-highlighted-option']");
    public static String buscarZonaHoraria = "buen";
    public static By elementseleccionarZonaHoraria = By.xpath("//*[contains(text(),'Buenos_Aires')]");
    public static By elementbotonCrearLocacion = By.xpath("//*[@icon='pi pi-plus']");
    public static By elementbotonEditar = By.xpath("//tbody/tr[1]/td[5]/div[1]/button[2]/span[1]");
    public static By elementeditarNombre = By.xpath("//input[@id='name']");
    public static String editarNombre = "Sur";
    public static By elementbotonModificar = By.xpath("//*[@icon='pi pi-pencil']");
    public static By elementbotonDesactivar = By.xpath("//tbody/tr[1]/td[5]/div[1]/button[4]");
    public static By elementseleccionMotivo = By.xpath("//*[@id='reason']");
    public static By elementSeleccionarOtro = By.xpath("//*[contains(text(),'Otro')]");
    public static By elementbotonConfirmar = By.xpath(" //*[contains(text(),'Confirmar')]");
    public static By elementDropDownProvincia = By.xpath("//*[@formcontrolname='province']//following::input");
    public static By elementCiudad = By.xpath("//input[@class='ng-trigger ng-trigger-overlayContentAnimation ng-tns-c28-3 p-overlay-content ng-star-inserted']");
    public static String Ciudad = "Buenos Aires";
    public static By elementsearchProvincia = By.id("aria-activedescendant='p-highlighted-option");
    public static String searchProvincia = "dist";
    public static By elementSeleccionarDistritoFederal = By.xpath("//*[@class='p-dropdown-filter p-inputtext p-component']");
    public static By elementButtonEditarNombre = By.xpath("//*[@icon='pi pi-plus']");
    public static String ButtonEditarNombre = "5";
    public static By elementButtonModificar = By.xpath("//*[@icon='pi pi-pencil']");


}
