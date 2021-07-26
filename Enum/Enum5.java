package com.ust.examples;
enum whoisRIR{
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	AFRINIC("whois.afrinic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.nic.ad.jp"),
	KRNIC("whois.nic.or.kr"),
	CNNIC("ipwhois.ccnic.cn"),
	UNKNOWN("");
	
	private String url;
	
	whoisRIR(String url){
		this.url=url;
		
	}

public String url() {
	return url;
}
}
public class Enum5{
	public static void main(String[] args) {
		System.out.println(whoisRIR.ARIN.url());
	}
}
