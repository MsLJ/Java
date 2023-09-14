package com.ms.apr271uch.main;

import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class qwe {
	public static void main(String[] args) {
		HttpsURLConnection huc=null;
		try {
			String s="https://api.openweathermap.org/data/2.5/weather?appid=baff8f3c6cbc28a4024e336599de28c4&q=sichuan&units=metric&lang=kr";
			URL u=new URL(s);
			InputStream is=huc.getInputStream();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
