package com.fiap.sistema.sistema;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sistema {

	@RequestMapping(method = RequestMethod.GET, value="/sistema/", produces = "text/plain")
	public String getSistema() throws UnknownHostException  {
		
		String hostName =  null;
		
		try
		{
			hostName = InetAddress.getLocalHost().getHostName();
			
		} catch (UnknownHostException e) {
			
		}
		
		return "sistema " + hostName;
	}
}
