package CP_Login;

public class App {
    # language: en
    @PROFILE @ANDROID

    Feature: Ver Perfil


    Scenario Outline:Como usuario ingrese a la app
    Given El usuario ingresa con "<usuario>" y "<password>"
    When El usuario hace click en perfil
    Then Valida los elementos de perfil

    Examples:
            |usuario|password|
            |sherazo@itpatagonia.com|Baires2023*|
}
