package studyNote;

public class Test {
	public static void main(String[] args) {
		
		Fruit f;
		
		f = Fruit.PEACH;
		System.out.println(f.ordinal());
		System.out.println(f.name());
		
		System.out.println(f+", "+f.getColor());
     
		
		
//		for (Fruit f : Fruit.values()) {
//			System.out.println(f + ", " + f.getColor());
//		}
	}
}
