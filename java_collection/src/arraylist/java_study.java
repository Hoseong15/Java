package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class java_study {

	public static void main(String[] args) {
		
		ArrayList<member> mbr = new ArrayList<>(); // 앞에 작성을 하면 뒤에있는 <>안에 안해도된다.
		
		mbr.add(new member("이순신", "lee@gmail.com", "남성", 1012345678));
		mbr.add(new member("김유신", "kim@naver.com", "남성", 1023456789));
		mbr.add(new member("장영실", "jang@naver.com", "남성", 1015678234));
		mbr.add(new member("소서노", "so@naver.com", "여성", 1022769298));
		mbr.add(new member("신사임당", "shin@naver.com", "여성", 1022769298));
		
		System.out.println(mbr.get(2));
		System.out.println(mbr.size());
		System.out.println(mbr.subList(1, 4));
		
		// indexOf()
		member tmp = new member("소서노", "so@naver.com", "여성", 1022769298);
		System.out.println(mbr.indexOf(tmp));
		System.out.println(mbr.contains("김유신"));

		
		
		
		
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		
//		arr.add(10);
//		arr.add(20);
//		arr.add(30); // 배열의 마지막에 새로운 데이터 추가
//		arr.add(1,100); // 배열의 지정한 인덱스 위치에 새로운 데이터 추가
////		arr.add("이순신");
//
//		for(int i = 0; i < arr.size(); i++) {
//			if(arr.get(i) > 20)
//				System.out.println(arr.get(i));
//		}
//		
//		System.out.println("arraylist에 값 존재여부 contanins : " + arr.contains(20));
//		System.out.println("값이 몇번째 인덱스 indexOf : "+arr.indexOf(30));
//		System.out.println("arraylist에 값이 몇개 있냐 size : "+arr.size());
//		arr.remove(2); // 지정한 인덱스 위치의 값 삭제
//		System.out.println("arraylist 비어있나 isEmpty : " + arr.isEmpty());
//		System.out.println("범위내 값 출력 subList : " + arr.subList(1, 3));
//		
//		arr.set(1, 200);
//		System.out.println("갑 변경 set : " + arr);
//		
//		//arr.toArray() - ArrayList를 정적 배열로 변환
//		
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("이순신"); name.add("강감찬"); name.add("김유신"); name.add("장영실");
//		String[] names = new String[name.size()];
//		name.toArray(names);
//		System.out.println(Arrays.toString(names));
//		
//		//정렬
////		Collections.sort(arr); // 사전적 슌서 정렬
//		arr.sort(Comparator.naturalOrder()); // 사전적 순서 정렬
//		arr.sort(Comparator.reverseOrder()); // 사전적 순서의 역방향 정렬
//		System.out.println(arr);
//		
//		Collections.sort(name);
//		System.out.println(name);
		
		
		
	}

}


// ArrayList
//	기존의 배열을 동적으로 사용하기 위한 클래스
//	기존 배열과 다른점은 타입을 여러 타입으로 지정해서 사용 할 수 있다.(제네릭)
//	ArrayList에 기본 데이터타입ㅇ은 Object라는 자바 최상위 클래스 타입이다.
//	Obejct타입으로 저장되기때문에 사용하고자 하는 타입을 지정해서 사용해야한다.
//	ArrayList처럼 collection 모든 클래스들은 타입을 지정해서 사용해야 한다.
//
//	ArrayList<클래스> -> ArrayList(동작배열)에 저장할 데이터(객체)타입을
//	<>안에 작성하여 사용해야한다.
//	<>안에 클래스를 넣어주면 해당 타입으로 동작하는되도록 하는 방법은 제너릭이다.
//	제너릭은 사용자가 지정한 타입에 맞추어 사용 할 수 있도록 자바에서 제시하는 방법
//	제너릭을 사용하면 여러타입을 처리하기위한 코드의 복잡성이 줄어들고 
//	타입의 안정화를 도모 할 수 있다




// 자바 컬렉션
// 다수의 데이터 또는 다수의 객체를 저장, 관리, 가공하기위한 자료구조 및 알고리즘
// 개발자가 쉽게 사용할 수 있도록 만들어 놓은 인터페이스 및 클래스이다.

// Collection, Map

// Collection - List => ArrayList
//					 => Vector
//					 => LinkedList
//					 => Stack

//			  - Set  => HashSet
// 					 => TreeSet

// Map - HashTable
//     - HashMap
//     - TreeMap