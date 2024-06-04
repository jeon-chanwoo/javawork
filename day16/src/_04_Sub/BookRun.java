package _04_Sub;

import java.util.List;
import java.util.Scanner;

public class BookRun {

	private BookController bc = new BookController();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        BookRun run = new BookRun();
        run.start();
    }

    public void start() {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    listAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        } while (choice != 9);
    }

    private void showMenu() {
        System.out.println("******* 메인 메뉴 *******");
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서 전체 조회");
        System.out.println("3. 도서 검색 조회");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 명 오름차순 정렬");
        System.out.println("9. 종료");
        System.out.print("메뉴 선택: ");
    }

    private void insertBook() {
        System.out.print("책 제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("카테고리: ");
        String category = scanner.nextLine();
        System.out.print("가격: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        Book newBook = new Book(title, author, category, price);
        bc.insertBook(newBook);
        System.out.println("도서가 추가되었습니다.");
    }

    private void listAll() {
        List<Book> books = bc.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("책이 없습니다.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private void searchBook() {
        System.out.print("검색할 책 제목: ");
        String title = scanner.nextLine();
        Book book = bc.searchBook(title);
        if (book == null) {
            System.out.println("검색하는 책이 없습니다.");
        } else {
            System.out.println(book);
        }
    }

    private void deleteBook() {
        System.out.print("삭제할 책 제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        boolean result = bc.deleteBook(title, author);
        if (result) {
            System.out.println("도서를 삭제하였습니다.");
        } else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }

    private void ascBook() {
        bc.ascBook();
        System.out.println("정렬을 하였습니다.");
	}

}
