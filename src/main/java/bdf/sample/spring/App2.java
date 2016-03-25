package bdf.sample.spring;


import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by bforeste on 3/24/16.
 *
 * @author bforeste
 */
public class App2 {
    public static void main(String [] args) throws IOException {
    AmazonS3 s3Client = new AmazonS3Client(new DefaultAWSCredentialsProviderChain());
		AccessControlList acl = s3Client.getBucketAcl("pqd-apps");
		String location = s3Client.getBucketLocation("pqd-apps");
    System.out.println(location);

		System.out.println(s3Client.doesObjectExist("pqd-apps", "/canon/nightly-master/chef/launch-0.1.1.json"));
		System.out.println(s3Client.doesObjectExist("pqd-apps", "canon/nightly-master/chef/launch-0.1.1.json"));

		System.out.println(s3Client.doesObjectExist("pqd-apps", "canon/nightly-master/chef/launch-0.1.1.json"));

		S3Object object = s3Client.getObject(new GetObjectRequest("pqd-apps", "canon/nightly-master/chef/launch-0.1.1.json"));
    System.out.println("Content-Type: "  + object.getObjectMetadata().getContentType());
    String result = StreamUtils.copyToString(object.getObjectContent(), Charset.forName("UTF-8"));
    System.out.println(result);
    }
}
