package _06_sub;

public class Book {
	String title;
	String author;
	String publisher;
	
	Book(){
	}
	Book(String title, String author, String publisher){
		this.title=title;
		this.author=author;
		this.publisher=publisher;
	}
	
	void setTitle(String title) {
		this.title=title;
	}
	String getTitle() {
		return this.title;
	}
	
	void setAuthor(String author) {
		this.author=author;
	}
	String getAuthor() {
		return this.author;
	}
	
	void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	String getPublisher() {
		return this.publisher;
	}
	
	public String toString() {
		return "제목 : "+this.title + ", 저자 : "+this.author + ", 출판사 : "+this.publisher;
	}
}
