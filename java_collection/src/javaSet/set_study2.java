package javaSet;

import java.util.TreeSet;

public class set_study2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		
		do {
			int num = (int)(Math.random()*50)+1;
			tree.add(num);
//			System.out.println(num);
		}while(tree.size() < 10);
		System.out.println(tree);
		
		// 검색
		System.out.println(tree.floor(30)); // 일치하는 값을찾고 없을경우 작은값중에 가장 가까운값을 찾는다 그래도 없으면 null
		System.out.println(tree.headSet(25)); // 지정한 값보다 작은 값 전체출력
		System.out.println(tree.tailSet(27)); // 지정한 값보다 큰 값 전체출력
		System.out.println(tree.higher(40)); // 지정한 값보다 큰 값중에서 가장 가까운값 출력
		System.out.println(tree.lower(20)); // 지정한 값보다 작은 값중에서 가장 가까운값 출력
		System.out.println(tree.subSet(10, 30)); // from과 to사이의 값 출력
		
		
		
		
		
		
		
		
		
		
	}

}
