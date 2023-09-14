package com.ms.apr271uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//데이터를 주고받는데
//A(주고)->B(받는데)
//B의 입장에서 받은거 써먹으려면 파싱
//A랑 B사이의 통일된 형식이 필요할거고
//XML:데이터를 HTML형식으로 표현
//JSON: 데이터를 Java script형식으로 표현
//		요즘 JSON이 주력,XML은 구하기도 힘든
//		=>XML파싱 별로 못해도
//		JSON이 주력이기때문

//XML시스템의 원래 주인
//	AJAX:Javascript에서 XML파싱
//	Java에서 XML파싱


//baff8f3c6cbc28a4024e336599de28c4

//https://api.openweathermap.org/data/2.5/weather?
//파라메터
//appid=키&q=seoul(도시명)&units=metric&lang=kr
//=appid=baff8f3c6cbc28a4024e336599de28c4&q=seoul&units=metric&lang=kr
//https://api.openweathermap.org/data/2.5/weather?appid=baff8f3c6cbc28a4024e336599de28c4&q=(도시 영어로)&


//XML(eXtended Markup Language)
//JSON(JavaScript Object Notation)
//	Java
//		Dog d=new Dog(); 객체
//		d.setName("후추")
//		int[]ar={123,1232,12234};배열

//		JavaScript
//			var d={name:"후추",age:3}; 객체
//			var ar=[021,22,3123];  배열



public class UCHMain {
	public static void main(String[] args) {
		HttpsURLConnection huc=null;
		BufferedWriter bw=null;
		try {
			String s="https://api.openweathermap.org/data/2.5/weather?appid=baff8f3c6cbc28a4024e336599de28c4&q=sichuan&units=metric&lang=kr";
			URL u= new URL(s);
			huc=(HttpsURLConnection)u.openConnection();
			InputStream is=huc.getInputStream();
			InputStreamReader isr=new InputStreamReader(is,"utf-8");
			FileOutputStream fos=new FileOutputStream("C:\\lee\\work space\\sichuanweather.csv",true);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
			bw=new BufferedWriter(osw);
			
			//JSon 파싱 자바에서 여러가지가 있지만 친숙한
			//https://mvnrepository.com/search?q=json-simple 를활용
			JSONParser jp=new JSONParser();
//			jp.parse(br.readLine());
			JSONObject jo=(JSONObject)jp.parse(isr);//전체 다 불러오기
//			JSONArray ja=jp.parse(isr);
			JSONArray ja=(JSONArray) jo.get("weather");
			JSONObject w=(JSONObject) ja.get(0);
			System.out.println(w.get("description"));
			//기온
			JSONObject t=(JSONObject) jo.get("main");
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy,MM,dd,HH");
			String when=sdf.format(new Date());
			bw.write(when);
			bw.write(w.get("description")+",");
		//여기값이 그냥 넣으면 값이 인트여서 에러가 뜨는데 뒤에 ""넣어서 앞에걸 스트링으로 만들어서 적기
			bw.write(t.get("humidity")+"\r\n");
			
			
			System.out.println(t.get("feels_like"));
			System.out.println(t.get("humidity"));
			
			//습도
				
			//배열
			//객체
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
				
		
	}

}
