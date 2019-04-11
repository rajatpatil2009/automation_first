package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fill {

	public static WebDriver driver;
	   
    public static int arr1[] ={0,65,40,15,20,77,40,60,20,25,27,15,77,20,30,29};
    public static int arr2[] ={0,100,73,50,45,100,100,100,45,48,42,42,100,50,65,52};
    public static int arr3[] ={0,0,91,73,80,0,0,0,65,84,65,77,0,75,90,73};
    public static int arr4[] ={0,0,100,100,100,0,0,0,100,100,100,100,0,100,100,83};
    public static int arr5[] ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,100,100};
public static int r=0;
   
    public static  void click(int a,int b,int c,int d,int e, int i,int j)
    {

    if(i>=1 && i<=a )
    {
    driver.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[2]/div["+  j  +"]/div/div[2]/div/content/div/div[1]/label/div/div[1]/div[3]/div")).click();
   
    r++;
    System.out.println("r"+r);
    }
    else if(i>=a+1 && i<=b)
    {
    driver.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[2]/div["+  j  +"]/div/div[2]/div/content/div/div[2]/label/div/div[1]/div[3]/div")).click();
   
   
    r++;
    System.out.println("a"+r);}
    else if(i>=b+1 && i<=c)
    {
    driver.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[2]/div["+j+"]/div/div[2]/div/content/div/div[3]/label/div/div[1]/div[3]/div")).click();
   
   
    r++;
    System.out.println("j"+r);}
    else if(i>=c+1&& i<=d)
    {
    driver.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[2]/div["+j+"]/div/div[2]/div/content/div/div[4]/label/div/div[1]/div[3]/div")).click();
   

    r++;
    System.out.println("a"+r);}
    else if(i>=d+1&& i<=e)
    {
    driver.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[2]/div["+j+"]/div/div[2]/div/content/div/div[5]/label/div/div[1]/div[3]/div")).click();
   
   
    r++;
    System.out.println("t"+r);
    }
   
    else
    {
        System.out.println("error");
    }
    }

    public static void main(String[] args) throws InterruptedException
    {
       
       
        String driverpath ="E:\\personal\\chroma driver for  selinium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfZJ-LR8fXtU3RIUG0WHVvoQ-1p1AgE9f1CxsKBZm5AFpibqw/viewform?vc=0&c=0&w=1");
       
        for(int i=1; i<101;i++)
        {
        	 driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfZJ-LR8fXtU3RIUG0WHVvoQ-1p1AgE9f1CxsKBZm5AFpibqw/viewform?vc=0&c=0&w=1");
        	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        for(int j =1; j<16;j++)
        {
        click(arr1[j],arr2[j],arr3[j],arr4[j],arr5[j],i,j);
        r=0;
        //    click(2,5,0,0,0,i,j);
        }
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[3]/div/div/div/content/span")).click();
  ////*[@id="mG61Hd"]/div/div[2]/div[3]/div/div/div/content/span
        Thread.sleep(2000);

    }

}
    }