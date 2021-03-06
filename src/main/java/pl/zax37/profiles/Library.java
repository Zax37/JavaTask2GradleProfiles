package pl.zax37.profiles;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Library {
	static final Properties prop = new Properties();
	static final String propFileName = "db.properties";
	
    public static void main(String[] args) {
        try (InputStream inputStream = ClassLoader.getSystemResourceAsStream(propFileName)) {
			prop.load(inputStream);
			
			String user = prop.getProperty("database.jdbc.username");
			System.out.println(user);
		} catch (IOException e) {
            e.printStackTrace();
        }
    }
}
