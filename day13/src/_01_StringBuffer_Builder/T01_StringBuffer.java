package _01_StringBuffer_Builder;

public class T01_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));

		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(s1);
		System.out.println(s2);

		sb1.append("def");
		System.out.println(sb1);
		sb1.append(123);
		System.out.println(sb1);
		sb1.append(true);
		System.out.println(sb1);

		sb1.deleteCharAt(8);
		System.out.println(sb1);
		sb1.delete(6, 10);
		System.out.println(sb1);

		sb1.insert(1, "java");
		System.out.println(sb1);

		sb1.replace(5, sb1.length(), s2);
		System.out.println(sb1);

		StringBuffer sb5 = new StringBuffer();
		StringBuffer sb6 = new StringBuffer();
		System.out.println("sb5의 버퍼 크기"+sb5.capacity());
		System.out.println("sb6의 버퍼 크기"+sb6.capacity());
		
		StringBuffer sb7 = new StringBuffer(32);
		System.out.println("sb7의 버퍼 크기"+sb7.capacity());
		
	}

}
