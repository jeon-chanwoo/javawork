package _06_sub;

import java.util.ArrayList;

public class LibraryController {
	Member mem1 = new Member();
	ArrayList<Book> aList = new ArrayList<Book>();
	
	LibraryController(){
		this.mem1 = new Member();
		mem1.name = "전찬우";
		mem1.age = 29;
		mem1.gender= "남";
	}
	
	void info() {
		System.out.println("이름 : "+mem1.name);
		System.out.println("나이 : "+mem1.age);
		System.out.println("성별  : "+mem1.gender);
	}
	
	void insertBook(Book b) {
		aList.add(b);
	}
	
	ArrayList<Book> selectAll(){
		return aList;
	}
	
	Book searchBook(String bookTitle) {
        for (int i = 0; i < aList.size(); i++) {
            Book book = aList.get(i);
            if (book.title.equals(bookTitle)) {
                return book;
            }
        }
        return null;
    }
	
}
