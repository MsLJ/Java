package com.ms.apr252uch.main;
//HTTP통신

//Java에는 HTTP통신 기능이 없었음

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.spi.FileSystemProvider;

import javax.net.ssl.HttpsURLConnection;
//데이터 판매

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

//데이터를 주고 받을때 약속된 형식이 필요할것
//XML:데이터를 HTML형식을 빌려서 표현해놓은
//JSON:데이터를 JavaScript형식을 빌려서 표현해놓은

//parsing :쓸데없는 부분 걷어내고 원하는 형태로 가공

//DOM(Document Object Model)객체
//	<태그명 속성명="값" 속성명="값">	:시작태그
//	텍스트						:텍스트
//	</태그명>						:종료태그
public class UCHMain2_XMLParsing {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;

		try {
			String s = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4136052000";
			URL u = new URL(s);
//			HttpURLConnection
			////////////////////////////////////////////
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			
			// XML파싱:Java에 기본적으로 없음
			// 전세계의 수많은 개발자가 XML파싱기능 만들어놨을것
			// https://mvnrepository.com/ 여기에 개발자들이 기능 만들어놓음
			// kxml:안드로이드에는 내장
			// 상위 클래스
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
//			xpp.setInput(isr);
			xpp.setInput(is, "utf-8");
			
		String tagName=null;
			int what =xpp.getEventType();//지금 받은값이 셋중에 뭐냐
			while (what!=XmlPullParser.END_DOCUMENT) {
				if (what==XmlPullParser.START_TAG) {
//					System.out.println(xpp.getName());
					tagName=xpp.getName();
					
					
				}else if (what==XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
					if (xpp.getText().equals("3")) {
						break;
						
					}
//						System.out.printf("시간(24):%s\n",xpp.getText());
						
						
						
					}else if (tagName.equals("temp")) {
//						System.out.printf("온도:%s\n",xpp.getText());
					}else if (tagName.equals("wfKor")) {
//						System.out.println(xpp.getText());
						System.out.println("------------");
						
					}
					
						
					
//					System.out.println(xpp.getText());
					
				}else if (what==XmlPullParser.END_TAG) {
					tagName="";
					//tagName=null로하면 갈비지 컬렉션으로 저장한값을 다 날림
//					System.out.println(xpp.getName());
					
				}
				//지금 받아낸거 처리할껀 처리
				xpp.next();
				what=xpp.getEventType();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
