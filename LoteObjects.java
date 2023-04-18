package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Instant;

public class LoteObjects {

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
    public static By elementBotonLotes1 = By.xpath("//span[contains(text(),'Lotes')]");
    public static By elementBotonLotes2 = By.xpath("//span[contains(text(),'Lotes')]");
    public static By elementBotonCrear = By.xpath("//*[@routerlink='/batchs/create']");
    public static By elementingresoNombre = By.id("name_batch");
    public static String ingresoNombre = "San Miguel";
    public static By elementDropDownTipo = By.id("batch_type");
    public static By elementSeleccionarCultivoGeneral = By.xpath("//*[@aria-label='Cultivo general']");
    public static By elementDropDownSala = By.id("room");
    public static By elementSeleccionarSalaAutomation = By.xpath("//body/app-root[1]/div[1]/main[1]/app-create-batch[1]/div[1]/form-create-batch[1]/div[1]/div[1]/div[4]/div[1]/span[1]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]");
    public static By elementDropDownSector = By.id("sector");
    public static By elementSeleccionarSectorAutomation = By.xpath("//span[contains(text(),'Automation Sector - 7234')]");
    public static By elementSeleccionarInicio = By.id("started_at");
    public static By elementSeleccionarFechaInicio = By.xpath("//tbody/tr[1]/td[7]/span[1]");
    public static By elementDropDownOrigen = By.id("origin");
    public static By elementSeleccionarSemillas = By.xpath("//body/app-root[1]/div[1]/main[1]/app-create-batch[1]/div[1]/form-create-batch[1]/div[1]/div[1]/div[7]/div[1]/span[1]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/p-dropdownitem[2]/li[1]");
    public static By elementDropDownGenetica = By.id("genetic");
    public static By elementSeleccionarPampa = By.xpath("//body/app-root[1]/div[1]/main[1]/app-create-batch[1]/div[1]/form-create-batch[1]/div[1]/div[1]/div[9]/div[1]/span[1]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/p-dropdownitem[1]/li[1]/i[1]");
    public static By elementingresoTerreno = By.id("terrain");
    public static String ingresoTerreno = "Santa Rosa de la Pampa";
    public static By elementSeleccionarCosecha = By.id("projected_harvest_date");
    public static By elementSeleccionarFechaCosecha = By.xpath("//tbody/tr[5]/td[6]/span[1]");
    public static By elementingresoPeso = By.id("projected_harvest_weight");
    public static String ingresoPeso = "250";
    public static By elementDropDownSexo = By.id("sex");
    public static By elementSeleccionarMacho = By.xpath("//span[contains(text(),'Macho')]");
    public static By elementingresoSistema = By.id("system");
    public static String ingresoSistema = "Alfa";
    public static By elementingresoPlantasCrear = By.id("plants_qty");
    public static String ingresoPlantasCrear = "100";
    public static By elementingresoCantSemillas = By.id("seed_qty");
    public static String ingresoCantSemillas = "100";
    public static By elementingresoNumPrecinto = By.id("key_plant");
    public static String ingresoNumPrecinto = "123456";
    public static By elemenetBotonCrearLote = By.xpath("//*[@icon='pi pi-plus']");
    public static By elementbotonEditar = By.xpath("//body[1]/app-root[1]/div[1]/main[1]/app-list-batch[1]/div[1]/div[2]/div[2]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[7]/div[1]/button[1]/span[1]");
    public static By elementeditarNombre = By.xpath("//input[@id='name_batch_update']");
    public static String editarNombre = " del Monte";
    public static By elementbotonModificarTodo = By.xpath("//body/app-root[1]/div[1]/main[1]/app-update-batch[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
    public static By elementbotonConfiguraciones = By.xpath("//body[1]/app-root[1]/div[1]/main[1]/app-list-batch[1]/div[1]/div[2]/div[2]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[7]/div[1]/button[2]/span[1]");
    public static By elementseleccionEliminar = By.xpath("//span[contains(text(),'Eliminar')]");
    public static By elementingresarDesperdicio = By.id("waste");
    public static String ingresarDesperdicio = "10";
    public static By elementseleccionMotivo = By.xpath("//*[@id='reason']");
    public static By elementSeleccionarOtro = By.xpath("//*[contains(text(),'Otro')]");
    public static By elementbotonConfirmar = By.xpath("//*[contains(text(),'Confirmar')]");

}
