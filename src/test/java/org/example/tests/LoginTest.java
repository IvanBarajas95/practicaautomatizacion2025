package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.pages.LoginPage;
import org.example.utils.WebDriverUtils;

public class LoginTest {

    private WebDriver driver;

    // Método que se ejecuta antes de cada test
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtils.getChromeDriver(); // Inicializa el WebDriver
    }

    // Método que ejecuta la prueba de login
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(); // Navegar a la URL de la página de login
        loginPage.login("student", "Password123"); // Realiza el login con credenciales
        // Aquí podrías agregar más validaciones (asserts) para verificar el éxito del login
    }

    // Método que se ejecuta después de cada test para cerrar el WebDriver
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Cierra el navegador y termina la sesión de WebDriver
        }
    }
}
