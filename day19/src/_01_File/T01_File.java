package _01_File;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
			File f2 = new File("C:\\Users\\TJ\\Desktop\\찬우입니다\\테스트파일이당.txt");
			f2.createNewFile();
			File tempFolder = new File("C:\\Users\\TJ\\Desktop\\찬우입니다\\temp");
			tempFolder.mkdir();
			File f3 = new File("C:\\Users\\TJ\\Desktop\\찬우입니다\\temp\\테스트.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			
			System.out.println(f3.getName());
			System.out.println(f3.getAbsolutePath());
			System.out.println(f3.length());
			System.out.println(f3.getParent());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
