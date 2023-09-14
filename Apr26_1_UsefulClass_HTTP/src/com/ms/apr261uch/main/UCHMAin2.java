package com.ms.apr261uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

//네이버에 검색결과 달라고 요청
//
//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%E3%84%B4%E3%85%81%E3%85%87
//js8a3iKcJsnzGvTy7N0Y

//lGgWGRmKYz

//
//네이버 뉴스를 파일에기록하는 프로그램
//인터넷 주소 체계
//		프로토콜://서버주소/폴더명/폴더명/..../파일명?변수명=값&변수명=값&....
//		프로토콜-통신방식(http or https)

//서버측에 정보를 보내
//	request parameter-공개적
//	request header-내부적 (보안성이 높은)
//인터넷 주소에 한글 넣으면x
//	ㅋ->%2A(URL인코딩)
public class UCHMAin2 {
	// 이래저래 없앨게 많아서->
	// 오늘만 이럴까
	// 네이더 데이터 쓴다면 또 이런게 필요

	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		BufferedWriter bw=null;
		try {
			String q = "주식";
			q = URLEncoder.encode(q, "utf-8");
			String s = "https://openapi.naver.com/v1/search/news.xml?query=" + q;
			URL u = new URL(s);
			FileOutputStream fos=new FileOutputStream("C:\\lee\\work space\\naver news.txt",true);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
			bw=new BufferedWriter(osw);
			
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("X-Naver-Client-Id", "js8a3iKcJsnzGvTy7N0Y");
			huc.addRequestProperty("X-Naver-Client-Secret", "lGgWGRmKYz");
			InputStream is = huc.getInputStream();
			
			
			
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			String tagName = null;
			boolean data = false;

			int what = xpp.getEventType();// 지금 받은값이 셋중에 뭐냐
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						data = true;

					}

				} else if (what == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
//							System.out.println(StringCleanner.clean(xpp.getText()));
							bw.write(StringCleanner.clean(xpp.getText())+"\t");
							

						} else if (tagName.equals("description")) {
//							System.out.println(StringCleanner.clean(xpp.getText()));
							bw.write(StringCleanner.clean(xpp.getText())+"\r\n");
							bw.flush();

						}

					}

				}

				xpp.next();
				what = xpp.getEventType();
			}
			// 지금 받아낸거 처리할껀 처리

		} catch (

		Exception e) {
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
