import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String[] input = {"0", "5", "afmc", "221","062022","test"};
		
		String school="Armed Forces Medical College";
		
       WebDriver driver = new FirefoxDriver();
		
       System.setProperty("webdriver.gecko.driver","D:\\webdriver\\geckodriver.exe");
		
       String baseUrl = "http://10.0.1.150/gp/service.php?userid=trust&password=trust123&msisdn=01727262490&SessionID=sfsdfsf&ShortCode=733&response=";
       
       for(int i=0;i<input.length;i++) {
    	   driver.get(baseUrl+input[i]);
    	   TimeUnit.SECONDS.sleep(1);
    	   
       }
       
       WebElement w= driver.findElement(By.xpath("/html/body")); 
       
    		   
       String ans = w.getText() ;
       
           
       
       if(ans.contains(school)) {
    	   System.out.println("Pass");
       }else {
    	   System.out.println("Fail");
       }
       
       
	}

	
}

