
public class Quiz_03 {
	public static void main(String[] ar) {
//		문제1
		int a = 1325;
		int b = 9327;
		System.out.println(a*b);
		
//		문제2
		long c = 10000000000L + 5000;
		System.out.println(c);
		
//		문제3
		char c1 = 'A';
		char c2 = 'B';
		System.out.println(c1+c2);
//		''은 문자열 아님 -> +를 하면 연산이 됨
		//해결방법 1
		System.out.print(c1);
		System.out.println(c2);
		//해결방법 2
		System.out.println(""+c1+c2);
	}
}
