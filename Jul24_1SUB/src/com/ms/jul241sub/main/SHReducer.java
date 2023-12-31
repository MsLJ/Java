package com.ms.jul241sub.main;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

// IN
//	20150101 23 25

// OUT
//	2015 53


public class SHReducer extends Reducer<Text, LongWritable, Text, LongWritable>{
	public static final LongWritable SUM = new LongWritable();

	@Override
	protected void reduce(Text arg0, Iterable<LongWritable> arg1,
			Reducer<Text, LongWritable, Text, LongWritable>.Context arg2) throws IOException, InterruptedException {
		long sum = 0;
		for (LongWritable l : arg1) {
			sum+=l.get();
		}
		SUM.set(sum);
		arg2.write(arg0, SUM);
	}
}
