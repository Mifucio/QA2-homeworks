import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Qa2FirstWebHomework {
    private final By ARTICLE = By.tagName("article");
    private final By ARTICLE_TITLE = By.xpath(".//span[@itemprop = 'headline name']");
    private final By COMMENTS_COUNT = By.xpath(".//span[contains(@class, 'list-article__comment')]");

    @Test

    public void firstWebTestHomework(){

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://tvnet.lv");



        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);
        System.out.println(articles.size());
        //System.out.println(articles.get(10).getText());

        for (WebElement we: articles){

            String titleToCheck = we.findElement(ARTICLE_TITLE).getText();

            int commentCount = 0;


        }

                //(int i = 0; i < elements.size(); i++) (elements.get(i).click)

    }
}

//tvnet pāriet uz galveno lapu, pāriet uz rakstu, pāriet uz raksta komentāriem.
//*pāriet uz n rakstu pēc kārtas, (izmantojot sarakstus)
//**pāriet uz rakstu pēc konkrēta nosaukuma
//***pārejot starp lapām pārbaudīt, vai rakstu nosaukumi galvenajā lapā atbilst nosaukumiem konkrētos rakstos, gan komentāros
//****kopā ar virsrakstierm pārbaudīt arī komentāru skaitu, vai komentu skaits, kas norādīts galvenajā lapā, atbilst skaitam rakstā un komentos. Pārbaudei izmantot Intus nevis Stringus
//*****pārbaudot komentāru skaitu pārbaudīt, ka to uzrādītais skaits atbilst faktiski esošajam skaitam.