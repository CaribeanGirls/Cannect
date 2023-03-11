package CP_Locacion;

import base.BaseDriver;
import helpers.WaitHelpers;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdriver
selenium.webdriver.common.keys import Keys
import sleep

public class BaseSteps {

driver = webdriver.Firefox()
        driver.get("https://uat.cannect.com.ar/locations")

        driver.implicitly_wait(10)

        #abrimos la nueva pestaña
        driver.execute_script("window.open('https://uat.cannect.com.ar/locations')")

        sleep(5)
        driver.quit()

    // Creamos una instancia de FirefoxDriver
    WebDriver driver = new FirefoxDriver();

    // Definimos dos variables para almacenar el momento en que comienza y finaliza la prueba
    long time_start, time_end;

    String web = "https://uat.cannect.com.ar/";
	System.out.println("Entrando a: " + Locaciones Cannect);
    public WaitHelpers waitHelpers = new WaitHelpers();

    time_start = System.currentTimeMillis();
	driver.get(Cannect);

    System.out.println("Carga de: " + Cannect + "finalizada");

    //Maximizamos la ventana
	driver.manage().window().maximize();

    //Buscamos el elemento para seleccionar boton +Crear
    WebElement element;
    element = driver.findElement(By.id("//*[@/locations/create]")).click();

	 System.out.println("Se creara una nueva locacion");

    //Buscamos el elemento para introducir nombre de la Locacion
    WebElement element2;
    element2 = driver.findElement(By.id("//*[@id="name"]"));
    //Introducimos un nombre
	  element2.sendKeys("Pampa" ++1);

    System.out.println("Se introdujo un nombre correctamente");

    //Pulsamos botón para introducir codigo
    WebElement element3;
    element3 = driver.findElement(By.id("//*[@id="code"]"));
    //Introducimos un Codigo
    element3.sendKeys("123" ++1);

	 System.out.println("Codigo");

    //Pulsamos botón para introducir Nombre de Contacto
    WebElement element4;
    element4 = driver.findElement(By.id("//*[@id="contact_name"]"));
    //Introducimos un Nombre de Contacto
    element4.sendKeys("Sharon Herazo");

	 System.out.println("Nombre de Contacto se introdujo exitosamente");

    //Pulsamos botón para introducir Email de Contacto
    WebElement element5;
    element5 = driver.findElement(By.id("//*[@id="contact_email"]"));
      element5.sendKeys("sharon@yopmail.com");

	 System.out.println("Email de Contacto se introdujo exitosamente");

    //Pulsamos botón para introducir Telefono de Contacto
    WebElement element6;
    element6 = driver.findElement(By.id("//*[@id="contact_phone"]"));
      element6.sendKeys("1122334455");

	 System.out.println("Telefono de Contacto se introdujo exitosamente");

    //Pulsamos botón para introducir Pais
    WebElement element7;
    element7 = driver.findElement(By.id("//*[@id="country"]")).click();
    element7 = driver.findElement(By.id("//*[@id="country"]"));
      element7.sendKeys("arg");
    element7 = driver.findElement(By.id("//*[@id="pr_id_31_list"]/p-dropdownitem/li")).click();

	 System.out.println("Se selecciono Pais Exitosamente");

    //Pulsamos botón para introducir Provincia
    WebElement element8;
    element8 = driver.findElement(By.id("//*[@id="province"]")).click();
    element8 = driver.findElement(By.id("//*[@id="province"]"));
      element8.sendKeys("di");
    element8 = driver.findElement(By.id("//*[@id="pr_id_3_label"]/font/font")).click();

	 System.out.println("Se selecciono Provincia Exitosamente");

     //Pulsamos botón para introducir Direccion
    WebElement element9;
    element9 = driver.findElement(By.id("//*[@aria-describedby="address-help"]")).click();
    element9 = driver.findElement(By.id("//*[@aria-describedby="address-help"]"));
      element9.sendKeys("laprida 1126");
    element9 = driver.findElement(By.id("//*[@icon="pi pi-search"]")).click();

	 System.out.println("Se ha introducido direccion exitosamente");

    //Pulsamos botón para introducir Codigo Postal
    WebElement element10;
    element10 = driver.findElement(By.id("//*[@id="postal_code"]"));
      element10.sendKeys("1126");

	 System.out.println("Codigo Postal se introdujo exitosamente");

    //Pulsamos botón para introducir Zona Horaria
    WebElement element11;
    element11 = driver.findElement(By.id("//*[@id="time_zone"]/div/span")).click();
    element11 = driver.findElement(By.id("//*[@id="time_zone"]/div/p-overlay/div"));
      element11.sendKeys("bueno");
    element11 = driver.findElement(By.id("//*[@id="pr_id_4_label"]/font/font[2]")).click();

	 System.out.println("Se ingreso Zona Horaria Exitosamente");

    //Pulsamos botón + Crear despues del formulario
    WebElement element12;
    element12 = driver.findElement(By.id("//*[@icon="pi pi-plus"]")).click();

	 System.out.println("Se creo Locacion Exitosamente");

    time_end = System.currentTimeMillis();
    double  time_total= time_end - time_start;
	 System.out.println("El tiempo tomado ha sido: "+ (time_total) +" ms");
	 System.out.println("El tiempo tomado ha sido: "+ (time_total/1000) +" s");
}