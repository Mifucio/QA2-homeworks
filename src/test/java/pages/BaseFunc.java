package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunc {
    // Collect elements, common to all functions
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    public WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc() {
        //Set browser window properties
        LOGGER.info("Setting webdriver path");
        System.setProperty("Webrdiver.chromedriver.driver", "C://chromedriver.exe");

        LOGGER.info("Opening browser window");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 10);
    }
    public void openUrl(String url) {
        LOGGER.info("Opening " + url + " web page");
        driver.get(url);
    }

}
