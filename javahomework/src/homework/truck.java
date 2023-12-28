package homework;

public class truck extends car {
	private String wheelSize; // 바퀴 크기 선택

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
		return "포터";
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
		return "현대";
	}

	public String getWheelSize() {
		return "20인치"+" 18인치";
	}

}
