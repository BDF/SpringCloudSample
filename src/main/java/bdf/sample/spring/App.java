package bdf.sample.spring;

import bdf.sample.spring.service.S3Resource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class App {

	public static void main(String[] args) throws IOException {
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("app-context.xml");
		ctx.scan("bdf.sample.spring");
		S3Resource s3Resource = ctx.getBean("S3Resource", S3Resource.class);
		InputStream resource = s3Resource.getResource("s3://pqd-apps/canon/nightly-master/chef/launch-0.1.1.json");
		String result = StreamUtils.copyToString(resource, Charset.forName("UTF-8"));
		System.out.println(result);

	}
}
