package org.mano.loop.ui.commons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class SeleniumHelperClass {
	WebDriver driver = SetWebdrivers.getDriver();

	public WebElement findWebElementbyXpath(String xpathString) throws Exception {
		return driver.findElement(By.xpath(xpathString));
	}

	public WebElement findWebElementbyid(String id) throws Exception {
		return driver.findElement(By.id(id));
	}

	public WebElement findWebElementbyCss(String cssString) throws Exception {
		return driver.findElement(By.cssSelector(cssString));
	}

	public WebElement findWebElementbyClass(String className) throws Exception {
		return driver.findElement(By.className(className));
	}

	public List<WebElement> findWebElementsbyId(String id) {
		return driver.findElements(By.id(id));
	}

	public List<WebElement> findWebElementsbyXpath(String xpathString) throws Exception {
		return driver.findElements(By.xpath(xpathString));
	}
	public List<WebElement> findWebElementsbyClass(String className) throws Exception {
		return driver.findElements(By.className(className));
	}
}
