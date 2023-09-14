package com.ms.jul252sh.main;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
//in
//	유비가 밥을 먹었

//out
//	유비 1

							//키값이 Object 들어오는게 Text
public class SHMapper extends Mapper<Object, Text, Text, IntWritable>{
	private static final Text WHO=new Text();
	private static final IntWritable ONE=new IntWritable(1);
	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		
		//비정형데이터니까
		StringTokenizer st=new StringTokenizer(value.toString()," ");
		String word=null;
		while (st.hasMoreElements()) {
			word=st.nextToken();
			//각 단어가 들어있는지
			if (word.contains("유비")||word.contains("현덕")) {
				WHO.set("유비");
				context.write(WHO, ONE);
				//키값 그리고 +1카운트
			}else if (word.contains("조조")||word.contains("맹덕") ){
				
				WHO.set("조조");
				context.write(WHO, ONE);
			}else if (word.contains("손권")||word.contains("중모")) {
				WHO.set("손권");
				context.write(WHO, ONE);
				
			}
			
			
		}
		
	}
	
	
	
}
