package com.mason.kdt07243.main;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// 20150101,100번,명륜3가,64,102

public class BHMapper extends Mapper<Object, Text, Text, LongWritable> {
	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");
	private static final SimpleDateFormat SDF2 = new SimpleDateFormat("E");

	private static final Text DATE = new Text();
	private static final LongWritable SUM = new LongWritable();
	private static final LongWritable ONE = new LongWritable(1);

	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, LongWritable>.Context context)
			throws IOException, InterruptedException {
		try {
			String[] line = value.toString().split(",");
			String day = SDF2.format(SDF.parse(line[0]));

			DATE.set(day + "_합");
			SUM.set(Long.parseLong(line[line.length - 1].trim()) + Long.parseLong(line[line.length - 2].trim()));
			context.write(DATE, SUM); // 월_합, 6000

			DATE.set(day + "_데이터수");
			context.write(DATE, ONE); // 월_데이터수, 1
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
