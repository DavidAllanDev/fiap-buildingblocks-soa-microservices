package com.fiap.microservice.microservice;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class microservice {

	@RequestMapping(method = RequestMethod.GET, value="/microservice/", produces = "text/plain")
	public String getMicroservice() throws UnknownHostException  {
		
		String hostName =  null;
		
		try
		{
			hostName = InetAddress.getLocalHost().getHostName();
			
		} catch (UnknownHostException e) {
			
		}
		
		return "microservice " + hostName;
	}
	
}
