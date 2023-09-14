package com.ms.jul241sub.main;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class SHMain {

	public static void main(String[] args) {
		try {
			Configuration c = new Configuration();
			Job j = Job.getInstance(c);

			j.setMapperClass(SHMapper.class);
			j.setCombinerClass(SHReducer.class);
			j.setReducerClass(SHReducer.class);

			j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(LongWritable.class);

			FileInputFormat.addInputPath(j, new Path("/busData2015.csv"));
			FileOutputFormat.setOutputPath(j, new Path(args[0]));

			j.waitForCompletion(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
