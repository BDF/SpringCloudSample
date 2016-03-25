package bdf.sample.spring.service;

import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bforeste on 3/24/16.
 *
 * @author bforeste
 */
@Service("S3Resource")
public class S3Resource  {
	private final ResourceLoader resourceLoader;

	@Autowired
	public S3Resource(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
		System.out.println(resourceLoader.getClass());
	}

	public InputStream getResource(String path) throws IOException {
		final Resource resource = resourceLoader.getResource(path);
		return resource.getInputStream();
	}

}
