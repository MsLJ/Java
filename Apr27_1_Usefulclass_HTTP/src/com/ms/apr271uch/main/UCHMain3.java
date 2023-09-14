package com.ms.apr271uch.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//http://openapi.seoul.go.kr:8088/(인증키)/json/CardBusStatisticsServiceNew/1/5/20151101/
//575a4655496b636839386f58586542

//2015/01/01~2022/12/31 1~5번 http통신
//	  2015,01,01,100번 (하계동~용산구청),명륜3가.성
//2)파싱
//3)날짜분리,사람수에 .0없애기
//4)파일에 쓰고
//5)판 키우기
//...
//해봤던 시도(오답노트)
//그냥 기본 for문돌려서 m과 d를 1로 설정후 for문 돌려서 그걸 주소값에 대입했을때 오류 발생--->기본적으로 일수는01 02 월수도 01이런식으로 표기 
//내가 for문돌려서 넣은건 1,2,3,4 당연하게도 주소에 들어가지 못한다
//그걸 위해 작업을 해놓은게 format으로 그 값을 설정해준다 두자리니까 02로
//그 후에 숫자니가 %d 그렇게 완성한게 format("02%d",m)이런 형식
//
//
//year가 string이라?
//아 그전에 했던거 format을 %d로해서 오류발생 일듯??
//format을 %s로했어야했을텐데
//string s="주소"+year+m+d;
//일때 계속해서 오류발생 주소에 들어가지도 못함 
//왜일지?
//"주소""2015"










public class UCHMain3 {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;

		try {
			String year = "2015";
			FileOutputStream fos = new FileOutputStream("C:\\lee\\work space\\bus" + year + ".csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
					for (int m = 1; m < 13; m++) {
						for (int d = 1; d < 32; d++) {
							for (int start = 1; start < 40002; start+=1000) {
								String ss=String.format("%d/%d/%s%02d%02d", start,start+999,year,m,d);
								
								
								
								
								
								String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardBusStatisticsServiceNew/"+ss;
								
								
								
								
								URL u = new URL(s);
								huc = (HttpURLConnection) u.openConnection();
								InputStream is = huc.getInputStream();
								InputStreamReader isr = new InputStreamReader(is, "utf-8");
								JSONParser js = new JSONParser();
								JSONObject jo = (JSONObject) js.parse(isr);
								JSONObject cb = (JSONObject) jo.get("CardBusStatisticsServiceNew");
								if (cb!=null) {
									
									
									//cb=null; 들어간 주소에 CardBusStatisticsServiceNew값을 구하는거니까 값이 없어서 오류 
									JSONArray rw = (JSONArray) cb.get("row");
									// ?->String
									// 1)공통적인 형변환 스타일
									// String use_dt=(String)station.ger("USE_DT)
									// 2)to String() 메소드 활용
									
									// 3)연산자 활용
//			String use_dt=station.get("USE_DT")+"";
									
									JSONObject station = null;
									for (int i = 0; i < rw.size(); i++) {
										station = (JSONObject) rw.get(i);
										String use_dt = station.get("USE_DT").toString();
										String ride_pasgr_num = station.get("RIDE_PASGR_NUM").toString();
										String alight_pasgr_num = station.get("ALIGHT_PASGR_NUM").toString();
										bw.write((use_dt.substring(0, 4) + ","));
										bw.write((use_dt.substring(4, 6) + ","));
										bw.write((use_dt.substring(6, 8) + "\r\n"));
										bw.write((ride_pasgr_num.replace(".0", "")));
										bw.write((alight_pasgr_num.replace(".0", "")));
										bw.write(station.get("BUS_STA_NM") + "");
										bw.write(station.get("BUS_ROUTE_NM") + "\r\n");
									}
									
									
								}
							}
							
						}
						
					}
			
		

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
