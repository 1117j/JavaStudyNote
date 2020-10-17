package studyNote;

public class IdTester {

	public static void main(String[]args) {
		Id a = new Id();	//아이디 1
		Id b = new Id(); 	//아이디 2
		
		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());

		System.out.println("부여한 아이디의 개수  : " + Id.getCnt());
		
		
		//인스턴스 메서드 호출 시 : 클래스형 변수 이름.메서드 이름
		//클래스 메서드 호출 방법: 클래스이름.메서드 이름
	}

}
