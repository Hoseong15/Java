package homework;

public class truck extends car {
	private String wheelSize; // ���� ũ�� ����

	public truck(int displacement, int weight, String color, String maker, String wheelSize ,String name) {
		super(displacement, weight, color, maker, name);
		this.wheelSize = wheelSize;
	}

	public void setWheelSize(String wheelSize) {
		this.wheelSize = wheelSize;
	}
	
	@Override
	public void handle() {}
	
	public String name() {
		return "����";
	}

	public String displacement() {
		return "3000cc";
	}

	public String weight() {
		return "300kg";
	}

	public String getColor() {
		return "red";
	}

	public String getMaker() {
		return "����";
	}

	public String getWheelSize() {
		return "20��ġ"+" 18��ġ";
	}

}
