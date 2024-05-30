package _04_Sub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BookController {
	private List<Book> list = new ArrayList<Book>();

	
	// 책 객체 4개를 리스트에 추가
	public BookController() {
		list.add(new Book("b", "Author1", "Category1", 1000));
		list.add(new Book("a", "Author2", "Category2", 2000));
		list.add(new Book("d", "Author3", "Category3", 3000));
		list.add(new Book("s", "Author4", "Category4", 4000));
	}

	// 리스트 맨 뒤에 책 추가
	public void insertBook(Book book) {
		list.add(book);
	}
	
	public List<Book> getAllBooks() {
        return list;
    }
	
	// 제목으로 책 검색하여 객체 반환
	public Book searchBook(String title) {
		for (Book book : list) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}

	// 책 제목과 저자가 일치하면 리스트에서 삭제
	public boolean deleteBook(String title, String author) {
		for (Book book : list) {
			if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				System.out.println(book);
				list.remove(book);
				return true;
			}
		}
		return false;
	}

	// 제목을 기준으로 오름차순 정렬
	public void ascBook() {
		Collections.sort(list);
		for (Book book : list) {
			System.out.println(book);
		}
	}

}
