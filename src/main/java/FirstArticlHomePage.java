import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstArticlHomePage {
    WebDriver driver;

    public FirstArticlHomePage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isNintendoSwitchDisplayed(){
        By productTitle = By.cssSelector("#productTitle");

        WebElement nintendoSwitch = driver.findElement(productTitle);
        String resultat = "Nintendo Switch avec paire de Joy-Con Rouge Néon et Bleu Néon";
        return nintendoSwitch.getText().equals(resultat);

        /*By ResultSelector = By.id("title_feature_div");
        WebElement Result = driver.findElement(ResultSelector);
        String resultat = "Nintendo Switch avec paire de Joy-Con Rouge Néon et Bleu Néon";
        return Result.getText().equals(resultat);*/
    }
}
