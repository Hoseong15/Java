package study;
import java.util.Scanner;

public class java_method {
	static Scanner scan = new Scanner(System.in);
	
	// static - Ŭ����(static)�޼��忡���� ���� static������, static�޼��常 ��� ����
	//			static �޼��忡�� �ν��Ͻ������� �ν��Ͻ� �޼���� ���Ұ�
	
	public static void search(student[]std , String name) { // �̸����� ������ȸ
		
		boolean isStd = false;
		for(int i = 0; i < std.length; i++) {
			if(std[i].name.equals(name)) {
				System.out.println(std[i]);
				isStd = true;
			}
		}
		if(!isStd)
			System.out.println("��ϵ��� ���� �л��Դϴ�.");
	}

	public static void main(String[] args) {
	
		student[] std = new student[6]; // �������� 6�� ���� ����
		std[0] = new student("�̼���", 87, 88, 90);
		std[1] = new student("������", 70, 10, 80);
		std[2] = new student("�庸��", 80, 90, 100);
		std[3] = new student("������", 90, 90, 90);
		std[4] = new student("���", 100, 100, 100);
		std[5] = new student("������", 90, 90, 90);
		
		System.out.println("��ȸ �� �л� �̸� �Է� : ");
		String name = scan.nextLine();
		
		search(std, name);
		
		
//		std[0].calc();
		
//		System.out.println(std[0]);

//		student s = new student();

//		student std = new student("�̼���",90,70,100); // studentŬ���� ��ü�� �����ؼ� �������� std�� ����
//		std.name = "�̼���";
//		std.kor = 90;
//		std.mat  = 70;
//		std.eng = 100;
//		System.out.println(std);
	}

}
