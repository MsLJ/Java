package com.ms.jul252sh.main;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


//조조
//유비
//손권
//단어 수 세기
public class SHMain {
	public static void main(String[] args) {
		try {
		Job j=Job.getInstance(new Configuration());
		j.setMapperClass(SHMapper.class);
		j.setCombinerClass(SHReducer.class);
		j.setReducerClass(SHReducer.class);
		j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(IntWritable.class);
			String f=null;
			for (int i = 1; i < 11; i++) {
				f=String.format("/sam%d.txt", i);
				//add라서 여러개 넣기가가능한
				FileInputFormat.addInputPath(j, new Path(f));
				
			}
			//최상위의 rjResult라는 폴더에 결과를
			FileOutputFormat.setOutputPath(j, new Path(args[0]));
			//다 끝날때까지 기다리는거
			j.waitForCompletion(true);
			
			
		} catch (Exception e) {
	
		}
	}

}
