package com.ms.jul272samhadoop.main;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


//Hadoop:Java로 서버급 컴 여러대로 병렬처리
//		컴 자원 효율적으로 효율가능
//		대용량 데이터 감당
//		형태소분석? 맞춤법검사?
//		=>전처리(대용량 데이터 사이즈 줄여)

//Python:numpy,pandas,nltk,konlpy 등
//		분석 라이브러리
//		분석하기 편함
//		대용량?
//		=>Hadoop으로 전처리 해온걸 분석
public class SHMain {
	public static void main(String[] args) {
		try {
			Configuration c =new Configuration();
			Job j=Job.getInstance(c);
			
			j.setMapperClass(SHMapper.class);
			j.setCombinerClass(SHReducer.class);
			j.setReducerClass(SHReducer.class);
			
			j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(IntWritable.class);
			String f=null;
			//이번 bin/hadoop jar shHadoop.jar /SHResult3
			for (int i = 1; i < 10; i++) {
				f=String.format("/sam%02d.txt", i);
				FileInputFormat.addInputPath(j,new Path(f));
				
			}
			
			FileOutputFormat.setOutputPath(j, new Path(args[0]));
			j.waitForCompletion(true);
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
