package do_it_02Array;

public class ArrayNumeral {

	public static void main(String []args) {
		//10진수 28에 대한 16진수 표기 이딴거왜 함
//		System.out.println(0x1C);  //0x -> 16진수
//		System.out.println(034); //28을 8진수 표기// 0 -> 8진수


	}
	
	//입력받은 10진수를 2~36진수로 기수 변환하기
	static int convert(int x, int r, char[]d) {
		//정수 x를 r진수로 반환하여 배열 d에 아랫자리부터 넣고 자릿수 반환
		
		int digits = 0; //변환 후 자릿수
		String dchar = "0123456789ABCDEFGHIJJLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r; 
		}while ( x !=  0 ); 
		
		return digits;
	}
}
