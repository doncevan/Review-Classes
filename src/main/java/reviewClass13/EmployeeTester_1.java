package reviewClass13;

import Utils.CommonMethods;
import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class EmployeeTester_1 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        List<Map<String, String>> empData = ExcelReader.read(Constants.EXCEL_FILE_PATH_1, "Sheet2");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();

        for (Map<String, String> map : empData) {
            Thread.sleep(1000);
            driver.findElement(By.xpath("  //a[@id='menu_pim_addEmployee']")).click();
            String firstName = map.get("FirstName");
            String middleName = map.get("MiddleName");
            String lastName = map.get("LastName");
            String driversLicenseNumber = map.get("Driver'sLicenseNumber");
            String ssnNumber = map.get("SSNNumber");
            String otherID = map.get("OtherId");
            String licenseExpDate = map.get("LicenseExpiryDate");
            String sinNumber = map.get("SINNumber");
            String gender = map.get("Gender");
            String nationality = map.get("Nationality");
            String maritalStatus = map.get("MaritalStatus");
            String dateOfBirth = map.get("DateOfBirth");

            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(middleName);
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
            driver.findElement(By.xpath(" //input[@id='personal_txtLicenNo']")).sendKeys(driversLicenseNumber);
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtNICNo']")).sendKeys(ssnNumber);
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtOtherID']")).sendKeys(otherID);
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtLicExpDate']")).click();
            driver.findElement(By.xpath(" //input[@id='personal_txtLicExpDate']")).sendKeys(licenseExpDate);
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtSINNo']")).sendKeys(sinNumber);
            Thread.sleep(500);

            if (gender.equals("1.0")) {
                driver.findElement(By.xpath(" //input[@name='personal[optGender]' and @value='1']")).click();
            } else {
                driver.findElement(By.xpath(" //input[@name='personal[optGender]' and @value='2']")).click();
            }
            WebElement national = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
            Select sel = new Select(national);
            switch (nationality) {
                case "USA" -> sel.selectByVisibleText("American");
                case "England" -> sel.selectByVisibleText("British");
                case "Germany" -> sel.selectByVisibleText("German");
                case "France" -> sel.selectByVisibleText("French");
            }
            Thread.sleep(500);
            WebElement maritalStat = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
            Select sel1 = new Select(maritalStat);
            switch (maritalStatus) {
                case "Married" -> sel1.selectByVisibleText("Married");
                case "Single" -> sel1.selectByVisibleText("Single");
            }
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_DOB']")).click();
            driver.findElement(By.xpath(" //input[@id='personal_DOB']")).sendKeys(dateOfBirth);
            Thread.sleep(500);
        }
    }
}
