package reviewClass13;

import Utils.CommonMethods;
import Utils.Constants;
import Utils.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.Map;

public class EmployeeTester extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        List<Map<String, String>> empData = ExcelReader.read(Constants.EXCEL_FILE_PATH, "Sheet1");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();


        WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));

        for (Map<String, String> map : empData) {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            driver.findElement(By.xpath("  //a[@id='menu_pim_addEmployee']")).click();
            String firstname = map.get("FirstName");
            String middleName = map.get("MiddleName");
            String lastName = map.get("LastName");
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(middleName);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
            Thread.sleep(1000);
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
        }
    }
}