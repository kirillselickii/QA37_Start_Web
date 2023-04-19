import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;
    @Test
            public void test1(){
    WebElement el1 = wd.findElement(By.tagName("div"));
    WebElement el2 = wd.findElement(By.id("user"));
    WebElement el3 = wd.findElement(By.className("form-field"));
    WebElement el4 = wd.findElement(By.linkText("Log in"));

    //css
        WebElement elcss1 = wd.findElement(By.cssSelector("#user")); //id
        WebElement elcss2 = wd.findElement(By.cssSelector(".form-field")); //class
        WebElement elcss3 = wd.findElement(By.cssSelector("[data-testid='bignav']"));
        WebElement elcss4 = wd.findElement(By.cssSelector("[href='/login']")); //var 1  atribut+znachenie
        WebElement elcss5 = wd.findElement(By.cssSelector("a[href='/login']")); //var2  teg+element

    //login_css
        WebElement logcss1 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement logcss2 = wd.findElement(By.cssSelector("#user"));
        WebElement logcss3 = wd.findElement(By.cssSelector("#login"));
        WebElement logcss4 = wd.findElement(By.cssSelector("#password"));
        WebElement logcss5 = wd.findElement(By.cssSelector("#login-submit"));

    // Assert
        WebElement asslogcss1 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement asslogcss2 = wd.findElement(By.cssSelector(".js-open-header-member-menu"));
        WebElement asslogcss3 = wd.findElement(By.cssSelector(".qsCZSrob07JaSv"));

    //logOut+logo
        WebElement l6 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement l7 = wd.findElement(By.cssSelector("[data-testid='account-menu-logout']"));
        WebElement l8 = wd.findElement(By.cssSelector("#logout-submit")); //[data-testid='logout-button']

    //ends-contains-starts css
        WebElement s1 = wd.findElement(By.cssSelector("[aria-label='Atlassian Trello]"));
        WebElement s2= wd.findElement(By.cssSelector("[aria-label $='llo']"));    //ends
        WebElement s3= wd.findElement(By.cssSelector("[aria-label ^='Atlas']"));  //starts
        WebElement s4= wd.findElement(By.cssSelector("[aria-label *='rello']"));  //contains





    }

}
