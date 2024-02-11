package globalProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalParameters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Jivan Gavhane\\eclipse-workspace\\globalProperties\\src\\data.properties");
		prop.load(file);
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream file1=new FileOutputStream("C:\\Users\\Jivan Gavhane\\eclipse-workspace\\globalProperties\\src\\data.properties");
		prop.store(file1, null);
		

	}

}
