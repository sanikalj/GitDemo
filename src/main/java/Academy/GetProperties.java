package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
	Properties prop = null;
	FileInputStream fis = null;
	public Properties getPropData() throws IOException {
		
		prop =  new Properties();
		fis = new FileInputStream("C:\\Users\\sanikalj\\E2EProject\\src\\main\\java\\Academy\\data.properties");
		prop.load(fis);
		return prop;
	}
	


}
