package _03_ex01;

public class T01_main_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_book book1 = new T01_api_book();
		T01_api_book book2 = new T01_api_book("스프링");
		T01_api_book book3 = new T01_api_book("리액트", 12347);
		T01_api_book book4 = new T01_api_book("html", 12348, 45003);

		System.out.println(book1.bookName + "\t" + book1.ISBN + "\t" + book1.price);
		System.out.println(book2.bookName + "\t" + book2.ISBN + "\t" + book2.price);
		System.out.println(book3.bookName + "\t" + book3.ISBN + "\t" + book3.price);
		System.out.println(book4.bookName + "\t" + book4.ISBN + "\t" + book4.price);
	}

}
