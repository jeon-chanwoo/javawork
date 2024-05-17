package _05_ex1;

import java.util.Scanner;

public class SnackMenu {
	SnackController SnackController = new SnackController();
	Scanner sc1 = new Scanner(System.in);
	void menu() {
		
		
		System.out.print("종류 : ");
		String kind = sc1.next();
		System.out.print("이름 : ");
		String name = sc1.next();
		System.out.print("맛 : ");
		String flavor = sc1.next();
		System.out.print("개수 : ");
		int numOf = sc1.nextInt();
		System.out.print("가격 : ");
		int price = sc1.nextInt();
		SnackController.saveData(kind, name, flavor, numOf, price);
		System.out.println("저장완료");
		System.out.println("저장한 정보를 확인하시겠습니까? (y/n)");
		char yn = sc1.next().charAt(0);
		switch (yn) {
		case 'y': 
			SnackController.confirmData();
		default:
			
		}
	}
}
