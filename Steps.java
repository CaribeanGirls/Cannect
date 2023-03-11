package steps.login;

import helpers.AssertsHelpers;
import io.cucumber.java.en.Given;
import pom.home.HomePage;
import pom.login.LoginPage;
import steps.BaseSteps;
import org.testng.annotations.Test;

public class BaseSteps {

    // Creamos una instancia de FirefoxDriver
    WebDriver driver = new FirefoxDriver();

    // Definimos dos variables para almacenar el momento en que comienza y finaliza la prueba
    long time_start, time_end;

    String web = "https://uat.cannect.com.ar/";
	System.out.println("Entrando a: " + Cannect);
    public WaitHelpers waitHelpers = new WaitHelpers();

    time_start = System.currentTimeMillis();
	driver.get(Cannect);

    System.out.println("Carga de: " + Cannect + "finalizada");

    //Maximizamos la ventana
	driver.manage().window().maximize();

    //Pulsamos el botón para logarnos en la web
	driver.findElement(By.id("//*[@autocomplete="new-email"]")).click();

    System.out.println("Botón Identificarse pulsado");

    //Buscamos el elemento para introducir el usuario
    WebElement element;
    element = driver.findElement(By.id("email"));
	 element.sendKeys("sherazo@itpatagonia.com");

	 System.out.println("Email introducido");

    //Buscamos el elemento para introducir la  contraseña
    WebElement element2;
    element2 = driver.findElement(By.id("//*[@autocomplete="new-password"]"));
    //Introducimos la contraseña
	  element2.sendKeys("Baires2023*");

    System.out.println("Contraseña introducida");

    //Pulsamos botón para logarnos
	 driver.findElement(By.id("//*[button@icon="pi pi-sign-in"]")).click();

	 System.out.println("Login completado en: " + Cannect;

    time_end = System.currentTimeMillis();
    double  time_total= time_end - time_start;
	 System.out.println("El tiempo tomado ha sido: "+ (time_total) +" ms");
	 System.out.println("El tiempo tomado ha sido: "+ (time_total/1000) +" s");

}
