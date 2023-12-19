package study;

import java.util.Arrays;
import java.util.Scanner;

public class main_class {

	public static void main(String[] args) {
		String word = "i like banana chacha";

		// 1. ���ڿ����� Ư�� ���� ���� - charAt(
		char ch = word.charAt(2);
		System.out.println(ch);

//		Scanner scan = new Scanner(System.in);
//		ch = scan.next().charAt(0);
//		System.out.println(ch);

		// 2. ���ڿ� �� - equals()
		if (word.equals("i like"))
			System.out.println("����");
		else
			System.out.println("�����ʴ�");

		// 3. ���ڿ��� byte�� ��ȯ getBytes() - ���� �ҷ�����
		byte[] code = word.getBytes();
		System.out.println(Arrays.toString(code));

		// 4. ���ڿ����� Ư�� ���ڿ��� ��ġ�� ���� - indexOf()
		int k = word.indexOf('k');
		System.out.println(k);
		int banana = word.indexOf("banana");
		System.out.println(banana);
		int a5 = word.indexOf('a', 10);
		System.out.println(a5);
		int cha = word.indexOf("ch", 15);
		System.out.println(cha);

		// 5. ���ڿ��� ���� - length()
		int len = word.length();
		System.out.println("���ڿ��� ���� : " + len);

		// 6. ���ڿ� ����(ġȯ) - replace()
		String temp = word.replace("banana chacha", "rescue tayo");
		System.out.println("���� : " + word);
		System.out.println("������ : " + temp);

		// �ڹٽ�ũ��Ʈ���� ����ǥ������ �̿��Ͽ� ���ڿ� ����
		// �ڹٿ����� ����ǥ������ ����Ѵ�.
		// [^0-9] 
		// Ư���������� [^��-����-�Ӱ�-�Ra-zA-Z0-9]
		
		temp = word.replaceAll("a", "c");
		System.out.println(temp);
		
		temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]", "");
		System.out.println(temp);
		
		// 7. ���ڿ� ���� - substring
		
		temp = word.substring(5);
		System.out.println(temp);
		
		temp = word.substring(7,15);
		System.out.println(temp);
		
		temp =  "skyblue@naver.com";
		// ���̵�� ���л���Ʈ�ּ� �˾Ƴ���
		String id = temp.substring(0, temp.indexOf("@"));
		System.out.println("���̵� : " + id);
		
		String web = temp.substring(temp.indexOf("@")+1);
		System.out.println(web);
		
		temp = "���������� �߱� �߾ӷ� 121���� 20";
		// �� �ּҿ��� ���ø�� ���θ��� ����ϼ���
		String addr = temp.substring(0, temp.indexOf(" "));
		
		String addrname = temp.substring(temp.indexOf(" ", addr.length()+1 )+1);
		System.out.println(addr + " " + addrname);
		
		// 8.���ڿ� �и� - split(), �ϳ��� ���ڿ��� �迭�� ����
		String[] str = word.split(" ");
		System.out.println(Arrays.toString(str));
		temp  = "010-1234-5678";
		String password = temp.split("-")[2];
		
		temp = "12 �� 4570";
		String[] car = temp.split(" ");
		if(car[2].equals("4570")) {
			System.out.println("������ ����");
		} else if(car[0].equals("12")) {
			System.out.println("������ ����");
		}
		
		// 9. �빮��, �ҹ��� ��ȯ - toLoweCase() , toUpperCase()
		temp = word.toUpperCase();
		System.out.println("�빮�� : " + temp);
		
		temp = temp.toLowerCase();
		System.out.println("�ҹ��� : " + temp);
		
		// 10. ���ڿ��� ���ڿ��� ���� - concat()
		
		word = "���� �����ϴ� �뷡 : ";
		temp = "�ٳ��� �˷��� ������";
		String song = word.concat(temp);
		System.out.println(song);
		
		// 11. String ���������� ������ Ȯ��(���ڿ��� �ֳ� ����) isEmpty() - ���ڿ��� ������ false�� ������ true���� ���´�.;
		System.out.println(word.isEmpty());
		
		// 12. ���ڿ��� Ư������ �Ǵ� ���ڿ� ���� ���� - contains();
		System.out.println(word.contains("������"));
		
		// 13. Ư�� ���ڷ� ����, �������� �˻� - startsWith(), endWith()
		System.out.println(word.startsWith("��"));
		System.out.println(word.startsWith("����"));
		
		
		
		
		
		
	}

}
