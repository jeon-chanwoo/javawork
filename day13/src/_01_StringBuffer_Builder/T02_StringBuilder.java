package _01_StringBuffer_Builder;

public class T02_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		sb.append("program study");
		System.out.println(sb);
		
		sb.insert(4, "2");
		System.out.println(sb);
	
		sb.setCharAt(4, '5');
		System.out.println(sb);
		
		//String : 한번 객체가 생성되면 덮어쓰기 안됨 무조건 새로 생성
		//변하지 않는 문장령르 사용할 때 사용
		
		//StringBuffer : 추가, 수정, 삭제를 할 수 있다. 동기화를 지원한다.멀티쓰레드일때 사용한다.
		//자주 변경되는 문자열을 사용할때 사용
		
		//stringBuilder : 추가, 삭제, 수정을 할 수 있다. 동기화를 지우너하지 않는다.
		//자주 변경되는 문자열을 사용할 때, 단일 스레드일때 사용한다.
	}

}
