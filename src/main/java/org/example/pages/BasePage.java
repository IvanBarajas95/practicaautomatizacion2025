package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    // Constructor de la clase BasePage
    public BasePage(WebDriver driver) {
        this.driver = driver;
        // Inicializa los elementos de la página usando PageFactory
        PageFactory.initElements(driver, this);
    }

    // Métodos comunes para todas las páginas
    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    // Puedes agregar más métodos comunes aquí
}

