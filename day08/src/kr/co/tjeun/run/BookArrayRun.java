package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookArrayRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[3];
		Scanner sc1 = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			books[i] = new Book();
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			System.out.println(i+1 + "번째 도서 이름");
			String Btitle = sc1.nextLine();
			books[i].setTitle(Btitle);
			
			System.out.println(i+1 + "번째 도서 작가");
			String BAuthor = sc1.nextLine();
			books[i].setAuthor(BAuthor);
			
			System.out.println(i+1 + "번째 도서 가격");
			int BPrice = sc1.nextInt();
			books[i].setPrice(BPrice);
			sc1.nextLine();
			
			System.out.println(i+1 + "번째 도서 출판사");
			String BPublisher = sc1.nextLine();
			books[i].setPublisher(BPublisher);
		}
		for(int i=0;i<3;i++) {
			System.out.println(i+1 + "번째 도서 정보");
			System.out.print(books[i].information()+"\n");
		}
	}

}
