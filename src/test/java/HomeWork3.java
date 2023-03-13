import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork3 {
    WebDriver wd;

    @BeforeClass
    public void preCond(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void byTag(){
        WebElement tag= wd.findElement(By.xpath("/html/head/meta"));
        WebElement tag2= wd.findElement(By.xpath("/html/body/div/div"));
        List<WebElement> tag3= wd.findElements(By.xpath("/html/head/meta"));
        WebElement tag4= wd.findElement(By.xpath("//meta"));
        WebElement tag5= wd.findElement(By.xpath("//div"));
    }
    @Test
    public void byClass(){
        WebElement clas = wd.findElement(By.xpath("/html/body/div/div[@class='navbar-component_nav__1X_4m']"));
        WebElement class1= wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']"));
        WebElement class3= wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

    }

    @Test
    public void byAtrib(){
        WebElement atr=  wd.findElement(By.xpath("//a[starts-with(@href,'/home')]"));
        WebElement atr1= wd.findElement(By.xpath("//a[contains(@href,'/home')]"));
        WebElement atr2= wd.findElement(By.xpath("//a[text()='HOME']"));

    }
}
