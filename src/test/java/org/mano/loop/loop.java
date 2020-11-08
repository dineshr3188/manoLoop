/**
 * 
 */
package org.mano.loop;

import org.mano.loop.ui.commons.loopCommons;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Dinesh R
 *
 */
public class loop {
	
	@Test(priority = 1, groups = { "uiplus" })
	@Parameters({"tabs"})
	public void loopTest(int tabs) throws Exception {
		System.out.println("====================================================");
		loopCommons lc= new loopCommons();
		lc.functionsHere(tabs,"https://www.youtube.com/watch?v=IHcr9TV1Bb0&list=PLzQRNWPSIMQl5xHEC_2Vq9heyHrQTZ1mH");
	}
}
