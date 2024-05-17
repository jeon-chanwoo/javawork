package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookRun {

	public static void main(String[] args) {
		/*// 기본생성자 객체를 생성 후 getter setter메소드로 값 초기화
		Book book = new Book();
		book.setTitle("JAVA");
		book.setAuthor("전찬우");
		book.setPrice(35000);
		book.setPublisher("tjeun");
		
		System.out.println(book.information());
		//초기화 방법 매개변수가 있는 생성자 이용
		
		Book book2 = new Book("Spring", "나", 33333 , "우리집");
		System.out.println(book2.information());
		//사용자로부터 값을 입력받아 초기화 하여 출력하기
		
		Scanner sc1 = new Scanner(System.in);
		String bName = sc1.next();
		String bAuthor = sc1.next();
		int bPrice = sc1.nextInt();
		String bPublisher = sc1.next();
		Book book3 = new Book(bName, bAuthor, bPrice , bPublisher);
		System.out.println(book3.information());
		*/
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		Scanner sc1 = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			String bName = sc1.next();
			String bAuthor = sc1.next();
			int bPrice = sc1.nextInt();
			String bPublisher = sc1.next();
		}
		//for문을 돌려서 입력을 받는다
	}

}
