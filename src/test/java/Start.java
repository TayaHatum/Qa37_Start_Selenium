import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        wd=new ChromeDriver();
       // wd.get("https://www.google.com/"); without history
        wd.navigate().to("https://www.google.com/"); // with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        wd.close(); // only one tab if tab only  one & close browser
        wd.quit(); // all tabs & close browser

    }
}
