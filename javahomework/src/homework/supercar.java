package homework;

public class supercar extends car {
	private String ����;
	
	public supercar(int displacement, int weight, String color, String maker, String transmissionType, String name) {
		super(displacement, weight, color, maker, name);
		this.���� = ����;
	}
	
	public void setDisplacement(String displacment) {
		this.����=����;
	}
	
	@Override
	public void engine() {}
	
	public String name() {
		return "�ΰ�Ƽ";
	}

	public String displacement() {
		return "4000cc";
	}

	public String weight() {
		return "3000kg";
	}

	public String getColor() {
		return "orange";
	}

	public String getMaker() {
		return "������?";
	}

	public String getTransmissionType() {
		return "�ξƾƾƾ�";
	}
}
