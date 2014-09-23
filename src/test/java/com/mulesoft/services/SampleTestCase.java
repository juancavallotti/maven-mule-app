package com.mulesoft.services;

import java.util.HashMap;

import org.junit.Test;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.tck.junit4.FunctionalTestCase;

import static org.junit.Assert.*;

public class SampleTestCase extends FunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "src/main/app/sample-maven.xml";
	}
	
	@Test
	public void testFlow()  throws MuleException {
		
		String url = "http://localhost:8081/";
		
		HashMap<String, Object> headers = new HashMap<String, Object>();
		headers.put("http.method", "GET");
		
		MuleMessage msg = muleContext.getClient().send(url, "", headers);
		
		assertEquals("Http status should be 200", "200", msg.getInboundProperty("http.status"));
	}
	
	
}
