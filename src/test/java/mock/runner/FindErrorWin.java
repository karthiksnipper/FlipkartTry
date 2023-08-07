package mock.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;

import mock.manager.ObjectManager;
import mock.pages.KartPage;

public class FindErrorWin extends KartPage {
	
	@Test
	public  void miin () {
		anyDriver("chrome");
		enterApplUrl("https://www.flipkart.com/");
		insertValueByJs( getSearchBox(), "Redmi Note 11 PRO plus");
		elementClick(getSearchButton());
		
		String parentWin = driver.getWindowHandle();
		System.out.println(parentWin);
		elementClick(getRedmiPhantomWhite256());
		
		Set<String> allWindows = driver.getWindowHandles();
		List <String> nextWin =new LinkedList<String>();
		for(String x : allWindows) {
		if(!parentWin.equalsIgnoreCase(driver.getWindowHandle())){
			nextWin.add(x);       
		}}
	System.out.println(nextWin);
		
		
	}
}
