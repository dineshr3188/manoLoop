package org.mano.loop.ui.commons;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Presetup {
	
	@BeforeSuite(alwaysRun = true)
	@Parameters({"browser"})
	public void PresetupSuite(String browser) throws Exception {
		SetWebdrivers setWebDrivers = new SetWebdrivers();	
		setWebDrivers.openBrowser(browser);
	}
	
}
