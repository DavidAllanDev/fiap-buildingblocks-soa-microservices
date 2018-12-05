package com.fiap.sisXms.sisXms;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sisXms {

	@RequestMapping(method = RequestMethod.GET, value="/sisXms/", produces = "text/plain")
	public String getSisXms() throws UnknownHostException  {
		
		String hostName =  null;
		
		try
		{
			hostName = InetAddress.getLocalHost().getHostName();
			
		} catch (UnknownHostException e) {
			
		}
		
		return "sisXms " + hostName;
	}
}
