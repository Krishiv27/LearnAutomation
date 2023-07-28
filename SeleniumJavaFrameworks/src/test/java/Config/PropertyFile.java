package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNG_Demo;

public class PropertyFile {
	static Properties prop;
	static String projectPath;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getConfigProperty();
		setConfigProperty();
		getConfigProperty();

	}

	public static void getConfigProperty() {

		try {
			prop = new Properties();
			projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath+"/src/test/java/Config/config.properties");
			prop.load(input);
			
			TestNG_Demo.browserName=(prop.getProperty("browser"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static void setConfigProperty() {

		try {
			prop = new Properties();
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/Config/config.properties");
			prop.setProperty("browser", "FireFox");
			prop.store(output,"");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
