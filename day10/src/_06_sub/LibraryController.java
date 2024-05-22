package _06_sub;

import java.util.ArrayList;

public class LibraryController {
	ArrayList<Book> aList = new ArrayList<Book>();
	
	LibraryController(Member m){
	}
	
	void info(Member m) {
		System.out.println("이름 : "+m.name);
		System.out.println("나이 : "+m.age);
		System.out.println("성별  : "+m.gender);
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
