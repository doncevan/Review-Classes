package reviewClass13;


import Utils.CommonMethods;
import Utils.Constants;
import Utils.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class EmployeeDataFromExcelFile extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();

        List<Map<String, String>> empData = ExcelReader.read(Constants.EXCEL_FILE_PATH, "Sheet3");
        for (Map<String, String> map : empData) {
            driver.findElement(By.xpath("  //a[@id='menu_pim_addEmployee']")).click();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("FirstName"));
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("MiddleName"));
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("LastName"));
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtOtherID']")).sendKeys(map.get("OtherID"));
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtLicenNo']")).sendKeys(map.get("Driver'sLicense"));
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtLicExpDate']")).click();
            driver.findElement(By.xpath(" //input[@id='personal_txtLicExpDate']")).sendKeys(map.get("LicenseExpiryDate"));
            driver.findElement(By.xpath("(//img)[3]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtNICNo']")).sendKeys(map.get("SSN"));
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtSINNo']")).sendKeys(map.get("SIN"));
            Thread.sleep(500);
            if (map.get("Gender").equals("Male")) {
                driver.findElement(By.xpath(" //input[@name='personal[optGender]' and @value='1']")).click();
            } else {
                driver.findElement(By.xpath(" //input[@name='personal[optGender]' and @value='2']")).click();
            }
            Thread.sleep(500);
            WebElement maritalStat = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
            Select sel1 = new Select(maritalStat);
            switch (map.get("MaritalStatus")) {
                case "Married" -> sel1.selectByVisibleText("Married");
                case "Single" -> sel1.selectByVisibleText("Single");
                case "Divorced" -> sel1.selectByVisibleText("Other");
            }
            Thread.sleep(500);
            WebElement national = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
            Select sel = new Select(national);
            switch (map.get("Nationality")) {
                case "USA" -> sel.selectByVisibleText("American");
                case "England" -> sel.selectByVisibleText("British");
                case "Germany" -> sel.selectByVisibleText("German");
                case "France" -> sel.selectByVisibleText("French");
                case "Canada" -> sel.selectByVisibleText("Canadian");
                case "Italy" -> sel.selectByVisibleText("Italian");
                case "Australia" -> sel.selectByVisibleText("Australian");
                case "New Zealand" -> sel.selectByVisibleText("New Zealander");
                case "Ireland" -> sel.selectByVisibleText("Irish");
            }
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_DOB']")).click();
            driver.findElement(By.xpath(" //input[@id='personal_DOB']")).sendKeys(map.get("DateOfBirth"));
            driver.findElement(By.xpath("(//img)[4]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='personal_txtEmpNickName']")).sendKeys(map.get("Nickname"));
            Thread.sleep(500);
            if (map.get("SmokerStatus").equals("Yes")) {
                driver.findElement(By.xpath(" //input[@id='personal_chkSmokeFlag']")).click();
                Thread.sleep(500);
            }
            driver.findElement(By.xpath(" //input[@id='personal_txtMilitarySer']")).sendKeys(map.get("MilitaryStatus"));
            Thread.sleep(500);
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
            Thread.sleep(1000);
        }
        driver.quit();
    }
}
