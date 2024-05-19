package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://syntaxprojects.com/selenium_commands_selector.php");
        WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']"));
        textBox.clear();
        textBox.sendKeys("Minenhle");


     //Check if the radio button is Enable if Yes click on it and confirm its selected
       WebElement rb1= driver.findElement(By.xpath("//input[@value='option1']"));
       boolean selected=rb1.isSelected();
       if(!selected){
           rb1.click();
       }
      //confirmation
        System.out.println("The radiobutton is selected "+rb1.isSelected());
       // confirm that if the radiobutton is disabled, by printing on the console

        WebElement rb2= driver.findElement(By.xpath("//input[@value='option2']"));
        System.out.println("The status of the radio button is " +rb2.isEnabled());
       WebElement rb3 = driver.findElement(By.xpath("//input[@value='option3']"));
        System.out.println("Status display of the radio button3 is "+ rb3.isDisplayed());


        //get text from
       WebElement text= driver.findElement(By.xpath("//div[@id='textElement']"));
        System.out.println(text.getText());

       WebElement attribute = driver.findElement(By.xpath("//div[@id='attributeElement']")) ;
        System.out.println(attribute.getAttribute("data-custom-attribute"));

    }
}
