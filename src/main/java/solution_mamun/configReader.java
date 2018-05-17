package solution_mamun;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configReader {
	private String url;
	private static String chromeDriverPath;
	
	public configReader() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			prop.load(input);
			this.chromeDriverPath= prop.getProperty("chrome_driver");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			if(input != null) {
				try {
					input.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public String getUrl() {
		return url;
	}
	public static String getChromeDriver() {
		return chromeDriverPath;
	}

}
