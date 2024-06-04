package _04_BufferStream;

import java.io.*;

public class BufferStreamApi {
	//보조스트림 : 외부매체오ㅓㅏ 직접 연결하지 않음 단독하용으로 불가 반드시 기반 스트림과 함께 사용
	
	
	/*void fileSave() {
		//기반스트림으로 파일라이터를 사용하고 보조스트림으로 버퍼스트림 사용
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("file_buffer.txt");
			bw = new BufferedWriter(fw);
			bw.write("안녕하세여");
			bw.write("밥뭇나");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				// finally 블록에서 스트림을 닫음
				try {
					if (bw != null) {
						bw.close();
					}
					if (fw != null) {
						fw.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}*/
	
	void fileSave() {
		try(BufferedWriter bw = new BufferedWriter
				(new FileWriter("file_buffer.txt"))) {
			bw.write("안녕하세여");
			bw.write("밥뭇나");
			bw.write("밥뭇나");
			bw.write("밥뭇나");
			bw.write("밥뭇나");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	void fileRead() {
		int value =0;
		
		try (BufferedReader br=new BufferedReader(new FileReader("file_buffer.txt"))){
			while((value=br.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
