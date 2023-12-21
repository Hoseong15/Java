package study1;

import java.util.Scanner;

public class java_method {
	
	static void list_print(music[] mylist) {
		for(music obj : mylist) {
			System.out.println(obj);
		}
	}
	
	static void song_search(String keyword, music[] mylist) { // 가수 또는 노래제목으로 검색
		boolean issong = false;
		for(music obj : mylist) {
			if(obj.singer.equals(keyword) || obj.title.equals(keyword) ) {
				System.out.println(obj);
				issong = true;
			}
		}
		if(!issong)
			System.out.println("검색결과없음");
		
	}
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		music[] mylist = new music[] {
			new music("윤하", "P.R.R.W", 328),
			new music("볼빨간사춘기", "비야와라", 124),
			new music("소녀시대", "다시만난세계", 234),
			new music("폴킴", "있잖아", 311),
			new music("임영웅", "사랑은 늘 도망가", 138),
			new music("뉴진스", "ETA", 231),
			new music("엠투엠", "세글자", 228),
			new music("어반자카파", "널 사랑하지 않아", 147),
			new music("린", "실화", 311),
			new music("보아", "아틀란티스 소녀", 118)
		};
		System.out.println("가수 또는 제목으로 입력하세요");
		String keyword = scan.nextLine();
		
		song_search(keyword, mylist);
//		list_print(mylist);
		
		
		
		
	}

}
