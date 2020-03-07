package commons;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class CommonMethods {
	Properties prop;
private String configFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties";
public  CommonMethods(){

}	


public static void	readJson() throws FileNotFoundException{
	
	JsonParser jp = new JsonParser();
	FileReader ip = new FileReader("C:\\Users\\Kundan\\workspace\\MavenTest\\src\\test\\resources\\jsonFiles\\testdata.json");
	Object obj = jp.parse(ip);
	JsonObject jsonobject = (JsonObject) obj;
	JsonArray jsonarray = (JsonArray)jsonobject.get("userlogin");
	String arr[] = new String [jsonarray.size()];
	for(int i =0;i<jsonarray.size();i++){
		
		System.out.println(jsonarray.get(i));
	}
	
}


public String readPropFileVal( String key){
	Properties prop = new Properties();
	FileInputStream file = null;
	try {
		 file = new FileInputStream(configFilePath);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	try {
		prop.load(file);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
try {
	file.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	return prop.getProperty(key);
	
	
}


public static void main(String[] args) throws FileNotFoundException {
	readJson();
}
}
