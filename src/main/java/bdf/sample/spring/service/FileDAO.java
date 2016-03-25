package bdf.sample.spring.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by bforeste on 3/24/16.
 *
 * @author bforeste
 */
public interface FileDAO {

	InputStream getResource(String path) throws IOException;

}
