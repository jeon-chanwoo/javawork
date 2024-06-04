package _02_ByteStream;

public class T01_ByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램상의 데이터를 외부매체로 부터 입력 받거나 출력을 한다.
		//스트림은 통로의 특징을 가지고 있다. 단방향 입력과 출력을 동시에 하고자한다면
		//입력용과 출력용 2개를 만들어야 한다.
		//선입설출 시간지연 문제 있음
		//바이트 스트림 문자 스트림
		//외부매체와 직접 연결 하는지 에 따라
		//기반 스트림과 보조 스트림으로 나눈다.
		ByteStreamApi stapi = new ByteStreamApi();
		//stapi.fileSave();
		stapi.fileRead();
	}

}
