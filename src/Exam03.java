
public class Exam03 {
	public static void main(String[] args){
		
// //		[promotion 실습]
//		byte a = 10;
//		short b = 0;
//		b = a;
//		System.out.println(b); // 10 출력
//		
//		System.out.println(3/2); // 1 출력 ? 정수와 정수 연산이여서 출력값도 정수값이 나옴
//		System.out.println(3/2.0); 
//		// (int type/ double type) 
//		//(실수형이 정수형보다 큼)int type이 실수형으로 바뀜 -> 1.5 출력
//		
//		System.out.println("두 수의 합 : " + (10 + 5)); // 두 수의 합 : 15 출력 ,10+5에 괄호!
//		// string 타입과 + 이어져있는것들은 모두 string 타입으로 출력됨 
		
		
//			[Casting 실습]
		byte a = 0;
//		0000 0000
		short b = 10;
//		0000 0000
//		0000 1010
		
		// a = b; // error 발생
		a = (byte)b; // 해결 방법 - cast 문법 : 강제 형 변환 연산자 
		System.out.println(a); //10출력
		
		
	}
}
