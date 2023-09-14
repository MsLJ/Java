package com.ms.jul212wc.main;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

//2단계:Combine(자동으로 처리됨)
// IN
//		I 1
//		am 1
// 		a 1
//		a 1
//OUT(같은거 있으면 묶어주는)
//		I 1
//		am 1
//		a 1,1
///////////////////////
// 3단계:Reduce
// IN
//	 I 1
//	 am 1
//   a 1,1
//   boy. 1
// OUT
//	I 1
//	 am 1
//   a 2

//Mapper쪽이랑 형이 같아야함 다르게하면 오류터짐 ex: IntWritable  LongWritable
public class WCReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	private static final IntWritable SUM=new IntWritable();
	//항목 하나할때마다
	
	@Override
	protected void reduce(Text arg0,//a
			Iterable<IntWritable> arg1,//1,1
			Reducer<Text, IntWritable, Text, IntWritable>.Context arg2)//결과처리
					throws IOException, InterruptedException {
		int sum=0;
		for (IntWritable iw : arg1) {
			//iw.get쓰면 int형으로 받아와지니까
			sum+=iw.get();
		}
		SUM.set(sum);
		arg2.write(arg0, SUM);//a 2

	
	}

}
