package _01_properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class T01_properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//properties : map계열 => 키 값 세트 저장
		//hashmap과의 차이 : properties에는 키 = String, 값 = string 으로 담는다.
		
		Properties prop = new Properties();
		
		//값을 추가할 때
		// 1. setProperty(String key, String value)
		prop.setProperty("List","ArrayList");
		prop.setProperty("Set","HashSet");
		prop.setProperty("Map","HashMap");
		prop.setProperty("Map","Properties");
		
		System.out.println(prop);
		
		//key를 얻어올때
		//2. getProperty(String key)
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("AAA"));
		
		try {
			//파일로 내보내기
			prop.store(new FileOutputStream("test.properties"), "properties");
			
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
