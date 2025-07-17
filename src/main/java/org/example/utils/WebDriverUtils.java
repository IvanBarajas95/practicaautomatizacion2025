package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtils {

    // Método estático para obtener una instancia de ChromeDriver
    public static WebDriver getChromeDriver() {
        // Especifica la ubicación del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C:/Users/46144286/IdeaProjects/practicaautomatizacion/chromedriver.exe");

        // Opciones de Chrome, puedes personalizarlas según tus necesidades
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Abrir la ventana maximizada
        options.addArguments("--disable-notifications"); // Desactivar notificaciones, si es necesario
        options.addArguments("--incognito"); // Navegación en modo incógnito

        // Retorna una nueva instancia de ChromeDriver con las opciones definidas
        return new ChromeDriver(options);
    }
}

