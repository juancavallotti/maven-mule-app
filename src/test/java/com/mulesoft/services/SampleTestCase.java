package com.mulesoft.services;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

import static org.junit.Assert.*;

public class SampleTestCase extends FunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "src/main/app/sample-maven.xml";
	}
	
	@Test
	public void testFlow() {
		fail("Test not implemented");
	}
	
	
}
