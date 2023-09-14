package com.ms.jul252kakao.main;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;



public class KHMain {
	public static void main(String[] args) {
		try {
			Configuration c =new Configuration();
			Job j=Job.getInstance(c);
			
			j.setMapperClass(KHMapper.class);
			j.setCombinerClass(KHReducer.class);
			j.setReducerClass(KHReducer.class);
			
			j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(IntWritable.class);
			
			//원래 실행
			//bin/hadoop jar 파일명  
			//bin/hadoop jar 파일명  대상  결과폴더  
			FileInputFormat.addInputPath(j,new Path(args[0]));
			
			//최상위의 rjResult라는 폴더에 결과를
			FileOutputFormat.setOutputPath(j, new Path(args[1]));
			//작업끝날때까지 가만히
			j.waitForCompletion(true);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	

}

