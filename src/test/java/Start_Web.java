import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Start_Web {
        WebDriver wd;
        @Test
        public void test1(){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            wd = new ChromeDriver(options);
            wd.navigate().to("https://trello.com");
            wd.navigate().back();
            wd.navigate().forward();
            wd.navigate().refresh();

            wd.close();
            wd.quit();
        }
}
