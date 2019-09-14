package org.example;

import org.concordion.api.FullOGNL;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@FullOGNL
public class CastEnumFixture {
	
	private Color var1;
	public Color var2;
	
	public void setVar1(Color c) {
		var1=c;
	}
	
	public void doStuff(Color c) {
		// stuff here
	}


}
