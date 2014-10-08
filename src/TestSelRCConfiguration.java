package test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestSelRCConfiguration {
	
	public static void main(String[] args){
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.flipkart.com");
		selenium.start();
		selenium.windowMaximize();
		selenium.open("/");		
		selenium.setSpeed("2000");
		selenium.click("link=Lingerie & Sleep Wear");
		selenium.waitForPageToLoad("30000");
		Boolean res = selenium.isElementPresent("//img[@alt=\"Jockey Women's Brief Panty: Panty\"]");
		System.out.println("res = " +res);
		//selenium.click("//img[@alt=\"Jockey Women's Brief Panty: Panty\"]");
	}
}
