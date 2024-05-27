package _02_wrapperClass;

public class T01_wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i =Integer.valueOf(305);
		Integer i2 =Integer.valueOf(100);
		//비교해서 같으면 0 
		//문자열이면 사전순의 반대 1
		//문자열의 사전순일때 -1
		System.out.println(i.compareTo(i2));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.TYPE);
	}

}
