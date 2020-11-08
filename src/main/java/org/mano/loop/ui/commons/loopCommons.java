/**
 * 
 */
package org.mano.loop.ui.commons;

import java.util.ArrayList;

import org.mano.loop.ui.commons.SetWebdrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * @author Dinesh R
 *
 */
public class loopCommons {
	
	
	public void functionsHere(int n,String url) {
		
		for(int i=0;i<n;i++) {	
		((JavascriptExecutor) SetWebdrivers.getDriver()).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String> (SetWebdrivers.getDriver().getWindowHandles());
		SetWebdrivers.getDriver().switchTo().window(tabs.get(i));
		SetWebdrivers.getDriver().get(url);
		SetWebdrivers.getDriver().findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[2]/div/ytd-playlist-panel-renderer/div/div[1]/div/div[2]/div[1]/div[1]/ytd-menu-renderer/div/ytd-toggle-button-renderer[1]/a/yt-icon-button")).click();
		}
		
		
	}

}
