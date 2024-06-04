package _02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamApi {
	// xxxInputStream : xxx매체로부터 데이터를 입력받는 통로
	// xxxOutputStream : xxx매체로 데이터를 출력하는 통로

	void fileSave() {// 외부매체 파일에 출력을 한다. 데이터를 파일로 내보내기한다.
		// FileOutputStream : 파일과 직접연결해서 1바이트 단위로 출력
		// 스트림생성->출력->스트림반납

		try {
			// 파일이 없으면 만들어주고 있으면 통로 연결
			FileOutputStream fout = new FileOutputStream("file_byte.txt");

			// 파일에 데이터 출력하고자 할때 write메소드 사용
			fout.write(97);
			fout.write('b');
			byte[] arr = { 99, 65, 100 };
			fout.write(arr);
			fout.write(arr, 1, 2);

			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 외부매체로부터 파일을 읽어온다.

	}

	void fileRead() {
		// 파일로부터 1바이트 단위로 입력받는다.
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("file_byte.txt");

			try {
				int value =0;
				while ((value = fin.read()) != -1) {
					System.out.println(value);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
