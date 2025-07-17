package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    // Localizadores de elementos en la página de login
    private By usernameField = By.xpath("//input[@id='username']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@id='submit']");

    private String baseUrl = "https://practicetestautomation.com/practice-test-login/"; // URL de la página de login


    // Constructor de LoginPage que llama al constructor de BasePage
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Método para abrir la página de login
    public void open() {
        driver.get(baseUrl);
    }

    // Método para ingresar el nombre de usuario
    public void enterUsername(String username) {
        WebElement userField = driver.findElement(usernameField);
        userField.clear();
        userField.sendKeys(username);
    }

    // Método para ingresar la contraseña
    public void enterPassword(String password) {
        WebElement passField = driver.findElement(passwordField);
        passField.clear();
        passField.sendKeys(password);
    }

    // Método para hacer clic en el botón de login
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    // Método principal para hacer login con usuario y contraseña
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    // Puedes agregar más métodos relacionados con la página de login aquí
}
