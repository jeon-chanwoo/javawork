
package _03_ex;

public class _Ex07 {

	public static void main(String[] args) {
		// 주사위의 숫자 맞추기 게임
		// com의 숫자는 1~6
		//
		int score = 0;
		while (true) {
			double rand1 = Math.random();
			int com = (int) (rand1 * 6 + 1);
			System.out.println(com);
			score++;
			if (com == 6) {
				System.out.println(score + "회만에 맞추셨습니다");
				break;
			}
		}
	}
}
