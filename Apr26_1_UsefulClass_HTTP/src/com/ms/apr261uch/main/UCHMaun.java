package com.ms.apr261uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

//로그인 ->신청
//정부사이트
//	data.go.kr
//	data.seoul.go.kr
//	data.gg.go.kr
//포털사이트/SNS:개발자 센터

//1)HTTP통신 수행해서 다 콘솔에 출력
public class UCHMaun {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			URL u = new URL("http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/");
			huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is, "utf-8");
//			BufferedReader bfr = new BufferedReader(isr);
//			System.out.println(bfr.readLine());
			FileOutputStream fos = new FileOutputStream("C:\\lee\\work space\\Java  수업\\seoulWeather.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
//			xpp.setInput(isr);
			xpp.setInput(is, "utf-8");
			String tagName = null;
			Date now = new Date();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH");
			String now2 = sdf.format(now);
			int what = xpp.getEventType();// 시작태그or텍스트or종료
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();

//					System.out.println(xpp.getName());

				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("MSRRGN_NM")) {
						bw.write(now2);
//						System.out.print(xpp.getText() + ":");
						bw.write(xpp.getText() + ",");

					} else if (tagName.equals("MSRSTE_NM") || tagName.equals("PM10") || tagName.equals("PM25")) {
//						System.out.print(xpp.getText() + "\n");

						bw.write(xpp.getText() + ",");

					} else if (tagName.equals("IDEX_NM")) {
//						System.out.println(xpp.getText());
						bw.write(xpp.getText() + "\r\n");
						bw.flush();

					}
//					System.out.println(xpp.getText());

				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
//					System.out.println(xpp.getName());

					// 지금 받아낸거 처리할껀 처리
				}
				xpp.next();
				what = xpp.getEventType();
			}
		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		huc.disconnect();

	}
}
