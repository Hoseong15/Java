package study;

public class member {
	
	static String company; // Ŭ���� ���� 
	
	int num; // �ν��Ͻ� ����
	String name; // �ν��Ͻ� ����
	int age; // �ν��Ͻ� ����
	
	static { // Ŭ���� �ʱ�ȭ ���� - ���α׷����� �ɶ�
		company = "LG";
		//num = 10; // Ŭ���� �ʱ�ȭ ���������� �ν��Ͻ����� �ʱ�ȭ �Ұ���
	}
	
	{ // �ν��Ͻ� �ʱ�ȭ ���� - ��ü ������ ����
		company = "�Ｚ"; // �ν��Ͻ� �ʱ�ȭ �������� Ŭ�������� �ʱ�ȭ ����
		num = 50;
		name = "������";
	}
	member(){ // ������ �ż��� - �������ż���� return�� ����.
		// new member() -> ������ �ż��� ����
		num = 11;
		name = "�庸��";
	}
	
	public String toString() {
		return "��ȣ : " + num + " �̸� : " + name + " ���� : " + age;
	}
	
}

// �ν��Ͻ� ������ Ŭ���� ������ �ʱ�ȭ
// �ڹٿ��� class ������ ������ �ʱ�ȭ ���
// �������ʱ�ȭ , �ʱ�ȭ����, �����ڸż���

// ������ �ʱ�ȭ - ��������� ���ÿ� ������ ����(int num = 100;, String name = "�̼���";)
// �ʱ�ȭ ���� - �ν��Ͻ��ʱ�ȭ ����: { }
//		    - Ŭ���� �ʱ�ȭ ���� : static{ }


// �������� : ���� - �ż��峪 ����� �����ҋ� ����
//		   �Ҹ� - �ż��峪 ����� ����Ǹ� �Ҹ�

// �ν��Ͻ� ���� : ���� - Ŭ������ ��ü������ ����(Ŭ�������Ǹ����δ� �����ȵ�)
// (�ν��Ͻ��ż���) �Ҹ� - ��ü�� �Ҹ�Ǹ� �Ҹ�(��ü�� �ü���� jvm�� ���� �����ɶ�)

// Ŭ���� ���� :  ���� - ���α׷��� ����Ǹ鼭 Ŭ���� ���� �κ��� jvm�� �ε� �Ҷ� ����
// (Ŭ�����ż���)  �Ҹ� - ���α׷��� ����
