package bdf.sample.spring.config;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bforeste on 3/24/16.
 *
 * @author bforeste
 */
@Configuration
@ComponentScan("bdf.sample.spring")
public class AWSConfig {

	/**
	 * I believe this is not needed since according to the
	 * @see <a href="http://cloud.spring.io/spring-cloud-aws/spring-cloud-aws.html#_sdk_credentials_configuration">SDK credentials configuration</a>
	 */
	@Bean
	public DefaultAWSCredentialsProviderChain basicAWSCredentials() {
		return new DefaultAWSCredentialsProviderChain();
	}
}
