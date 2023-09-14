package com.ms.apr271uch.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//38선:위도 38도선 37.52025
//경도:121.32131  126.9017605

//37.5693582  126.9858652

//뉴욕 동물병원:37.52025  126.9017605 ???????검색해도 안나옴 ㅆ..
//b8fa6b88c1acddea8f6e06afb295981b

//프로토콜://Host/폴더/폴더/.../파일명

public class UCHMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		Scanner k = new Scanner(System.in);
		try {
			System.out.print("머:");
			String name = k.next();
			name = URLEncoder.encode(name, "utf-8");
			// 그냥 넣으면 글자깨지니까 형식변환
			String s = "https://dapi.kakao.com/v2/local/search/keyword.json";
			s += "?x=126.9858652&y=37.5693582&radius=3000&query=" + name;
			URL u = new URL(s);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK b8fa6b88c1acddea8f6e06afb295981b");
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			JSONParser js = new JSONParser();
			JSONObject jo = (JSONObject) js.parse(isr);
			JSONArray dc = (JSONArray) jo.get("documents");
			JSONObject l = null;
			for (int i = 0; i < dc.size(); i++) {
				l = (JSONObject) dc.get(i);
				System.out.println(l.get("address_name"));
				System.out.println(l.get("place_name"));
				System.out.println(l.get("road_address_name"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		k.close();
		huc.disconnect();
	}

}
