package study1;

import java.util.Scanner;

public class java_method {
	
	static void list_print(music[] mylist) {
		for(music obj : mylist) {
			System.out.println(obj);
		}
	}
	
	static void song_search(String keyword, music[] mylist) { // ���� �Ǵ� �뷡�������� �˻�
		boolean issong = false;
		for(music obj : mylist) {
			if(obj.singer.equals(keyword) || obj.title.equals(keyword) ) {
				System.out.println(obj);
				issong = true;
			}
		}
		if(!issong)
			System.out.println("�˻��������");
		
	}
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		music[] mylist = new music[] {
			new music("����", "P.R.R.W", 328),
			new music("�����������", "��߿Ͷ�", 124),
			new music("�ҳ�ô�", "�ٽø�������", 234),
			new music("��Ŵ", "���ݾ�", 311),
			new music("�ӿ���", "����� �� ������", 138),
			new music("������", "ETA", 231),
			new music("������", "������", 228),
			new music("�����ī��", "�� ������� �ʾ�", 147),
			new music("��", "��ȭ", 311),
			new music("����", "��Ʋ��Ƽ�� �ҳ�", 118)
		};
		System.out.println("���� �Ǵ� �������� �Է��ϼ���");
		String keyword = scan.nextLine();
		
		song_search(keyword, mylist);
//		list_print(mylist);
		
		
		
		
	}

}
