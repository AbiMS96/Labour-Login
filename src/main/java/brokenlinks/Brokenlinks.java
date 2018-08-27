package brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://mslabs.biz/labour/users/login");

		List<WebElement> link = driver.findElementsByTagName("a");
		System.out.println("Total Links are "+link.size());

		for(int i=0; i<link.size(); i++)
		{

			WebElement element = link.get(i);
			String url=element.getAttribute("href");
			System.out.println(url);
			System.out.println(element.getText());
			verifyLinkActive(url);
		}

	}

	public static  void verifyLinkActive(String url2) 
	{

		try
		{
			URL url = new URL(url2);
			HttpURLConnection http =(HttpURLConnection)url.openConnection();
			http.setConnectTimeout(3000);
			http.connect();
			if(http.getResponseCode()==200)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}if(http.getResponseCode()==201)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==202)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==400)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==401)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==402)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==403)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==404)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}
			if(http.getResponseCode()==500)
			{
				System.out.println(url2+" - "+http.getResponseMessage());
			}


		} 
		catch (Exception e)
		{


		}


	}

}

