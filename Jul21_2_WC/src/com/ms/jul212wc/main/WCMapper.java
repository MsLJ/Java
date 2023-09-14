package com.ms.jul212wc.main;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//1단계:Map

//IN
//	I am a boy.
//	you are a girl
//	there is a phone
//OUT
//	
//Mapper의 첫번째값은 키값인데 넣을게 없으니 Object로 그리고 들어오는게 Text
//Hadoop버젼 String->Text   Int->IntWritable   long ->LongWritable
public class WCMapper extends Mapper<Object, Text, Text, IntWritable> {
	//Static영역에 하나만 만들어놓고
	private static final Text WORD=new Text();
	private static final IntWritable ONE=new IntWritable(1);
	
	
	//어차피 이건 한 문장 불러낼때마다 불러지는 메서드
	//이 안에서 변수를 만들면 계속해서 Heap영역+Stack영역에 무리가 갈것
	//그렇기에 위에 그냥 static final로 처리해서 메모리를 절약하자
	@Override
	protected void map(Object key, // 데이터가 있나 검사하는 용도
			Text value, // 그 문장(I am a a boy.)
			Mapper<Object, Text, Text, IntWritable>.Context context)// 결과처리
			throws IOException, InterruptedException {

		String line = value.toString();// Text->String
		//split:정형
		//Stringtokenizer:비정형 데이터
		//문장을 띄워쓰기 기준으로
		StringTokenizer st=new StringTokenizer(line," ");
		//
		
		while (st.hasMoreTokens()) {
			WORD.set(st.nextToken());//값만 바꿔서
	
			context.write(WORD, ONE);//전송
			
		}

	}

}
