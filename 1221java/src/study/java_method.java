package study;
import java.util.Scanner;

public class java_method {
	static Scanner scan = new Scanner(System.in);
	
	// static - 클래스(static)메서드에서는 오직 static변수나, static메서드만 사용 가능
	//			static 메서드에서 인스턴스변수와 인스턴스 메서드는 사용불가
	
	public static void search(student[]std , String name) { // 이름으로 성적조회
		
		boolean isStd = false;
		for(int i = 0; i < std.length; i++) {
			if(std[i].name.equals(name)) {
				System.out.println(std[i]);
				isStd = true;
			}
		}
		if(!isStd)
			System.out.println("등록되지 않은 학생입니다.");
	}

	public static void main(String[] args) {
	
		student[] std = new student[6]; // 참조변수 6개 공간 생성
		std[0] = new student("이순신", 87, 88, 90);
		std[1] = new student("김유신", 70, 10, 80);
		std[2] = new student("장보고", 80, 90, 100);
		std[3] = new student("강감찬", 90, 90, 90);
		std[4] = new student("비담", 100, 100, 100);
		std[5] = new student("유성룡", 90, 90, 90);
		
		System.out.println("조회 할 학생 이름 입력 : ");
		String name = scan.nextLine();
		
		search(std, name);
		
		
//		std[0].calc();
		
//		System.out.println(std[0]);

//		student s = new student();

//		student std = new student("이순신",90,70,100); // student클래스 객체를 생성해서 참조변수 std에 저장
//		std.name = "이순신";
//		std.kor = 90;
//		std.mat  = 70;
//		std.eng = 100;
//		System.out.println(std);
	}

}
