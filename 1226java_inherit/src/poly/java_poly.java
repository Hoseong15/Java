package poly;

import inherit_test.house;
import inherit_test.tv;

public class java_poly {

	public static void main(String[] args) {
		
		 house t = new tv("삼성");
		 t.power();
		 
		 System.out.println(t.sn);
		 
		 house fan1 = new fan("신일");
		 
		 System.out.println(((fan)fan1).sn);
		 System.out.println(fan1.makedate);
		 System.out.println(((fan)fan1).makedate);
	}

}


// 클래스의 변수나 메서드에는 일반적으로 public을 사용한다.
// 인스턴스변수는 private 제어자로 생성하는게 좋다.
// 상속 관계일때 부모클래스의 생성자는 protected
// 부모클래스의 추상메서드는 public으로 
// 
// 제어자를 붙여서 작성해야지 사용제한 설정할 수 있고,
// 사용제한을 해줘야 실수 방지 및 불필요 코드 생성을 피할 수 있다.
//
 