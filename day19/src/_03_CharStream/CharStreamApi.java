package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	void fileSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("file_char.txt");
			
			fw.write('김');
			fw.write("점심 끝");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a','e','d','w'};
			fw.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void fileRead() {
		FileReader fr = null;
		
		try {
			int value = 0;
			fr = new FileReader("file_char.txt");
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
