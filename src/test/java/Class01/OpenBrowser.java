package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        //Instance of Chromedriver
        WebDriver driver = new ChromeDriver();

        //open the chrome browser
        driver.get("https://syntaxprojects.com/");

        //maximize the window
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        //get title of thw website
        String title= driver.getTitle();
        System.out.println("The title of the website is "+title);

        //Close the web driver

//      just for observation
        Thread.sleep(4000);

        driver.quit();

        }
}
