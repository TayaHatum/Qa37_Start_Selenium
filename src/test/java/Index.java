import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///Users/tayahatum/Downloads/apk/index.html");
    }

    @Test
    public void cssLocators(){
        // by tag name
       WebElement el= wd.findElement(By.tagName("button"));

       WebElement el1 = wd.findElement(By.tagName("a"));
      List<WebElement> list = wd.findElements(By.tagName("a"));
      int i =list.size();
      WebElement el4= list.get(2);

    }

}
