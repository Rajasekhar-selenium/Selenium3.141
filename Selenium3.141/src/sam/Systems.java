package sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Systems 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
		
	       //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
			driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			
			driver.manage().window().maximize();
			
			driver.close();
	}

}
