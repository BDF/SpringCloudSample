package bdf.sample.spring.service;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.cloud.aws.core.io.s3.SimpleStorageResourceLoader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ClassRelativeResourceLoader;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import java.net.URL;

/**
 * Created by bforeste on 3/24/16.
 *
 * @author bforeste
 */
public class S3ResourceTest  {

	private S3Resource s3Resource;

	@Before
	public void before() {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		s3Resource = new S3Resource(resourceLoader);
	}
}