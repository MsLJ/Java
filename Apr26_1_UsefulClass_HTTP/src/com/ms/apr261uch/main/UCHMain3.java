package com.ms.apr261uch.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

//2015/01/01~2022/12/31
//subway.csv
//	2015,01,01,1호선,종로3가,5000,3000
//.....

//1)2015/11/01의 1~5데이터 HTTP통신 확인
public class UCHMain3 {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;

		try {

			FileOutputStream fos = new FileOutputStream("C:\\lee\\work space\\subway.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			String getName = null;
			String when = null;
			for (int y = 2015; y < 2023; y++) {
				for (int m = 1; m < 13; m++) {
					for (int d = 1; d < 31; d++) {
						String date = String.format("%d%02d%02d", y, m, d);
						String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/CardSubwayStatsNew/1/610/" + date;
						URL u = new URL(s);
						huc = (HttpURLConnection) u.openConnection();
						InputStream is = huc.getInputStream();

						XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
						XmlPullParser xpp = xppf.newPullParser();
						xpp.setInput(is, "utf-8");
						int what = xpp.getEventType();// 지금 받은값이 셋중에 뭐냐
						// 이 위를 덮어씌우는 for문을써서 url을 계속 연결?
						while (what != XmlPullParser.END_DOCUMENT) {
							if (what == XmlPullParser.START_TAG) {
								getName = xpp.getName();
//					System.out.println(xpp.getName());

							} else if (what == XmlPullParser.TEXT) {
								if (getName.equals("USE_DT")) {
									when = xpp.getText();
									bw.write(when.substring(0, 4) + ",");
									bw.write(when.substring(4, 6) + ",");
									bw.write(when.substring(6, 8) + ",");
									bw.write(xpp.getText() + ",");

								} else if (getName.equals("LINE_NUM")) {
									bw.write(xpp.getText() + ",");

								} else if (getName.equals("SUB_STA_NM")) {
									bw.write(xpp.getText() + ",");

								} else if (getName.equals("RIDE_PASGR_NUM")) {
									bw.write(xpp.getText() + ",");

								} else if (getName.equals("ALIGHT_PASGR_NUM")) {
									bw.write(xpp.getText() + "\r\n");
									bw.flush();

								}

							} else if (what == XmlPullParser.END_TAG) {
								getName = "";
//					System.out.println(xpp.getName());

							}
							xpp.next();
							what = xpp.getEventType();
							// 지금 받아낸거 처리할껀 처리
						}
					}
				}
			}
//			for (int i = 20151101; i <= 20221231; i++) {
//				if (i == 20151231) {
//					i = 20160101;
//
//				} else if (i == 20161231) {
//					i = 20170101;
//
//				} else if (i == 20171231) {
//					i = 20180101;
//
//				} else if (i == 20181231) {
//					i = 20190101;
//
//				} else if (i == 20191231) {
//					i = 20200101;
//
//				} else if (i == 20201231) {
//					i = 20210101;
//
//				} else if (i == 20211231) {
//					i = 20220101;
//
//				}

			bw.close();

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}
