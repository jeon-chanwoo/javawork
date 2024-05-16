package _03_ex01;

public class T01_api_book {

	String bookName;
	int ISBN;
	int price;

	T01_api_book() {
		//this("자바", 12345, 45000);
		this.bookName = "자바";
		this.ISBN = 12345;
		this.price = 45000;
	}

	T01_api_book(String str1) {
		this.bookName = str1;
		this.ISBN = 12346;
		this.price = 45001;
	}

	T01_api_book(String str1, int num1) {
		this.bookName = str1;
		this.ISBN = num1;
		this.price = 45002;
	}

	T01_api_book(String str1, int num1, int num2) {
		this.bookName = str1;
		this.ISBN = num1;
		this.price = num2;
	}

}
