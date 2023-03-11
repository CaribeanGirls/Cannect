package pom.login;

import pom.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){

        super(driver);
    }


    //Button Ingresar desde los slider
    @WebDriverBy(xpath = "//android.widget.TextView[@text='INGRESAR']")
    @FirefoxDriverBy(accessibility = "pending")
    public webdriver btnIngresar;

    //Input Correo electronico
    @WebDriverBy(xpath = "//android.widget.TextView[@text='Correo electrónico']/../../android.widget.EditText")
    @FirefoxDriverBy(accessibility = "pending")
    public MobileElement inputEmail;

    //Input Contraseña
    @WebDriverBy(xpath = "//android.widget.TextView[@text='Contraseña']/../../android.widget.EditText")
    @FirefoxDriverBy(accessibility = "pending")
    public MobileElement inputPassword;

    //Button Ingresar
    @WebDriverBy(xpath = "//android.widget.TextView[@text='INGRESAR']")
    @FirefoxDriverBy(accessibility = "pending")
    public MobileElement btnIngresarApp;







}
