
public class Exam_02 {
	public static void main(String[] args) {

		byte a = 127; 
		short b = 32767;
		char c1 = 'A';
		char c2 = 65;
		int d = 2100000000;
		long e = 1000000000L;
		float f = 3.14f;
		double g = 5.12;
		boolean h = true; // false
		
		String i = "Hello world";
		
		
		// i라는 변수는 스택에 저장하고 값(데이터)는 힙에 저장
		// 힙에는 실제로 문자열이 저장되어있는게 아니라 그 데이터의 주소가 저장되어있음.
		// 정리 : 참조형들은 변수안에 주소가 저장되어있다. 
		// 정리 : 참조 형 변수는 항상 4byte
		
//		System.out.println(c1); //A가 출력됨
//		System.out.println(c1 + 10); //75가 출력됨
//		System.out.println(h); // true 출력
		
		
	}
}
