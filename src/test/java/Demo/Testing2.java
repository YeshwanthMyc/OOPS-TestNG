package Demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Testing2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:\\Users\\QUALIAN\\Downloads\\screenshot2.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test     
        public void demo() {
            System.out.println("Demo");
            System.out.println("Demo123");
            System.out.println("Demo12345");
            
            
        }
    
}
