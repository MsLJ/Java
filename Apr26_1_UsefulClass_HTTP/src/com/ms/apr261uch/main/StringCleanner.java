package com.ms.apr261uch.main;

public class StringCleanner {
	public static String clean (String s) {
		s=s.replace("quot;", "");
		s=s.replace("&,quot;", "");
		s=s.replace("&lt;b&gt;", "");
		s=s.replace("&lt;/b&gt;", "");
		s=s.replace("</b>", "");
		s=s.replace("&lt;/<b>&gt;", "");
		s=s.replace("<b>", "");
		s=s.replace("&apos;", "");
		s=s.replace("&", "");
		s=s.replace("&quot;", "");
		s=s.replace("&apos;", "");
		
		
		return s;
	}

}
