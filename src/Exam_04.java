
public class Exam_04 {
	public static void main(String[] ar) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		b = (byte)i;
		ch = (char)b;
		short s = (short)ch;
		// short 범위 : -32768 ~ 32767
		// char 범위 : 0 ~ 65535
		
		float f= l; // 실수는 항상 정수형 보다 큼
		i = ch;
		
		
	}
}
