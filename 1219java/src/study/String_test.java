package study;

import java.util.Arrays;

public class String_test {

	public static void main(String[] args) {
		//
		String song = "�� �ٳ��� �˷��� ������ �׷��� ���� �ٳ��� ������";
		
		// 1. ������ �����ϰ� �ٳ����� �������κ����Ͽ� ����ϼ���
		// 2. ���� �˷��� �ִ� ������ , ����Ͽ� �˷��� �ִ��� ����ϼ���
		//	(�˷��� ���ڿ� ���� ���� �̸��� ����)
		// 3. song ���ڿ� �տ� "��� �ص� ������ ����" ���ļ� �ϳ��� ���ڿ��� ���
		String newSong = song.replaceAll("�ٳ���", "������");
		System.out.println(newSong);
		
		String fauit = song.substring(song.indexOf(" ")+1 , song.indexOf("�˷���"));
		System.out.println(fauit);
		
		newSong = "��� �ص� ������ ���� ";
		System.out.println(newSong.concat(song));
		
		
		// ���� 
		
		song = "ũ������������ ���� ���� �������ʾƿ� # ���� ���ϴ°� �� �ϳ����� #"
				+ "Ʈ�� �Ʒ��� ���� �����͵� �Ű澲�� �ʾƿ� # ����� ���ؿ� #"
				+ "����� �����ϴ� �ͺ��� �� # �� �ҿ��� �̷���� #"
				+ "���� ũ���������� ���ϴ°� ����̿���";
		/*
		 * 1. # �������� ���پ� ����ϼ���(#�� ���â�� ������ �ȵǿ�)
		 * 2. ����̶�� �ܾ� ��� "�״�" ��� �ٲپ ���
		 * 3. ũ���������� ���� �����Ͽ� ���(�빮��)
		 * 4. ����°#���� ���簡 �������� ���
		 * */
		
		
		// 1��
		String[] str = song.split("#");
		System.out.println(Arrays.toString(str));
		
		
		// 2��
		String you = song.replaceAll("���","�״밡");
//		System.out.println(you);
		
		// 3��
		String temp = song.replaceAll("ũ��������", "chrismas");
		temp = temp.toUpperCase();
//		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
	}

}
