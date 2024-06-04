package _05_ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamApi {

	void fileSave() {
		Phone p1 = new Phone("갤럭시1", 1000000);
		Phone p2 = new Phone("갤럭시2", 2000000);
		Phone p3 = new Phone("갤럭시3", 3000000);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File_object.txt"))) {
			oos.writeObject(p1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	void fileRead() {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File_object.txt"))) {
				System.out.println(ois.readObject());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
