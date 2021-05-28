import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage OpenListArticle() {

        By BarreRecherche = By.cssSelector("#twotabsearchtextbox");
        driver.findElement(BarreRecherche).sendKeys("Nintendo Switch");

        By ValiderRecherche = By.cssSelector(".nav-right #nav-search-submit-button");
        driver.findElement(ValiderRecherche).click();
        return this;
    }

    public FirstArticlHomePage OpenFistArticle() {
        By articleSelector = By.cssSelector(".s-image");
        List<WebElement> listArticles = driver.findElements(articleSelector);
        listArticles.get(0).click();
        return new FirstArticlHomePage(driver);

    /*public DetailProduct OpenFistArticle(){
        By articleSelector = By.cssSelector(".s-image");
        List<WebElement> listArticles = driver.findElements(articleSelector);
        listArticles.get(0).click();
        return new DetailProduct(driver);
    }*/
    }
}
