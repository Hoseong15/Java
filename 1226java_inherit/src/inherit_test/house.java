package inherit_test;

public abstract class house {
	
	public static int makedate = 20231209; // Ŭ��������
	
	public boolean onoff;
	String brand;
	public int sn = 10000; // �ø���ѹ�
	
	protected house(){
		onoff = false;
		System.out.println("���� �θ� house Ŭ���� ������");
	}
	
	protected house(String brand){
		this.brand = brand;
	}
	
	public abstract void power(); // �߻� �޼��� 
	
	// �߻� �޼��带 ���� Ŭ������ �ݵ�� �߻�Ŭ������ �Ǿ���Ѵ�.(abstract�� �߰��ؾ���)
	
	// �θ�Ŭ������ �߻�Ŭ������� �ڽ�Ŭ������ �θ��� ��� �߻�޼��带 �����ؾ��Ѵ�.
	// �θ𿡰� ���� �߻�޼��带 �ڽ��� ����������������� �ڽ�Ŭ������ �߻�Ŭ������ �Ǿ���Ѵ�.
	// �߻� Ŭ������ ��ü������ �ȵȴ�.
	// �߻� �޼���� ������ ���� �޼���� �޸� ������ �Ҵ� ���� ���Ѵ�.
	// �޸� ������ �Ҵ� ���� ���ϱ⶧���� �߻�޼��带 ���� Ŭ������ ��ü ���� �Ҵ� ���޴´�.
	
	
}
