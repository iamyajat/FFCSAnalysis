package com.iamyajat;

import com.iamyajat.model.Course;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class DataStreamJob {

	public static void main(String[] args) throws Exception {
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		DataStream<Course> csvStream = env.readTextFile("/home/iamyajat/Desktop/Projects/FFCSAnalysis/src/main/resources/data/courses.csv")
				.map(Course::parse)
				.filter((course)-> course.roomNumber.startsWith("SJT"));

		//csvStream.writeAsText("/home/iamyajat/Desktop/Projects/FFCSAnalysis/src/main/resources/data/courses");
		csvStream.map(Course::toString).writeToSocket("", 9999, new SimpleStringSchema());
		csvStream.print();
		env.execute();
	}
}
