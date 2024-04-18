
public class Quiz_02 {
	public static void main(String[] ar) {
		byte b = 10;
		short s =20;
		char c ='A';
		int i;
		float f;
		long l = 100L;
		
		

//		c=b; bite가 char보다 작다고 말할 수 없음
//		c=(char)b; // 해결
		

		s=(short)c; // 해결
		
		c=(char)s;
		
		i=100; // 해결
		
		l = 500; //500은 int형
		
		f = l; // 실수형은 정수형보다 크다. 
		
		f = (float)5.11; // 해결 1 / (소수점은 무조건 double형!)
		f = 5.11f; // 해결 2
		
	}
}
