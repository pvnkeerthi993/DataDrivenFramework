package com.w2a.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestHostAdd {
	public static void main(String[] args) throws UnknownHostException {
		String messageBody="http://"+InetAddress.getLocalHost().getHostAddress()+"/jobs/DataDrivenLiveProject/htmlreports/HTML_20Report/extent.html";
		System.out.println(messageBody);
	}

}
