package _06_sub;

import java.util.ArrayList;

public class BookRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryController lc = new LibraryController(new Member("아",18,"집가고싶다"));
		
		lc.insertBook(new Book("제목1","저자1","출판사1"));
		lc.insertBook(new Book("제목2","저자2","출판사2"));
		lc.insertBook(new Book("제목3","저자3","출판사3"));
	
		ArrayList<Book> books = lc.selectAll();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", Publisher: " + book.publisher);
        }

        Book searchedBook = lc.searchBook("제목2");
        if (searchedBook != null) {
            System.out.println("Found book: " + searchedBook.title + ", Author: " + searchedBook.author + ", Publisher: " + searchedBook.publisher);
        } else {
            System.out.println("Book not found.");
        }
	}

}
