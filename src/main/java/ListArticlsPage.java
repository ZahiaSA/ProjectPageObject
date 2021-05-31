import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListArticlsPage {
    WebDriver driver;

    public ListArticlsPage(WebDriver driver){
        this.driver = driver;
    }

    public FirstArticlHomePage choiseFirstArticl() {
        By articleSelector = By.cssSelector(".s-image");
        List<WebElement> listArticles = driver.findElements(articleSelector);
        listArticles.get(0).click();
        return new FirstArticlHomePage(driver);
    }

}
