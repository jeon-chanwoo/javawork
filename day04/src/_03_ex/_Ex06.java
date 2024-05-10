package _03_ex;

public class _Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i = 1; i <= n; i++) {
            // 왼쪽 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
	}
}