import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PageObject {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();

        By cookiesId = By.cssSelector("#sp-cc-accept");
        driver.findElement(cookiesId).click();

    }
    @AfterTest
    public void TearDown() {
        driver.quit();
    }

    @Test
    public void testAmazon(){

        //Arrange
        //Act

        HomePage amazonHomePage = new HomePage(driver);
        boolean isNintendoSwitchDisplayed = amazonHomePage
                .OpenListArticle()
                .openList()
                .choiseFirstArticl()
                .isNintendoSwitchDisplayed();

        // Asset
        /*Assert.assertTrue(FirstArticlHomePage.contains("Nintendo Switch"),"il faut que nomchoisi contient Nintendo Switch");*/

    }
}