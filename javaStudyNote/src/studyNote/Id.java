package studyNote;
//p121  실습 3C-1

//아이디를 부여하는 클래스
public class Id {
	
	private static int cnt = 0; //아이디를 몇개 부여했는지 저장
	private int id; // 아이디
	
	//생성자
	public Id() { 
		id = ++cnt; 
	}

	//아이디를 반환하는 인스턴스 메서드
	public int getId() {
		return id; 
	}
	
	//counter를 반환하는 클래스 메서드
	public static int getCnt() {
		return cnt; 
	}
	
}
