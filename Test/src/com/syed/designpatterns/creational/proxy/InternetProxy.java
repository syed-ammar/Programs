/**
 * 
 */
package com.syed.designpatterns.creational.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sammar
 *
 */
public class InternetProxy implements Internet {
	
	private Internet internet;
	
	private static List<String> webSiteList = new ArrayList<String>();
	public InternetProxy() {
		internet = new InternetMain();
	}
	
	static {
		webSiteList.add("abc.com");
		webSiteList.add("def.com");
		webSiteList.add("jkl.com");
		webSiteList.add("qwe.com");
	}
	/* (non-Javadoc)
	 * @see com.syed.designpatterns.creational.proxy.Internet#connect(java.lang.String)
	 */
	@Override
	public void connect(String website) {
		if(webSiteList.contains(website)) {
			System.out.println("Access denied..");
		} else {
			internet.connect(website);
		}
	}

}
