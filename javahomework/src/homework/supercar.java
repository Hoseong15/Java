package homework;

public class supercar extends car {
	private String ����;
	
	public supercar(int displacement, int weight, String color, String maker, String enginetype, String name) {
		super(displacement, weight, color, maker, name);
		this.���� = ����;
	}
	
	public void setEnginetype(String enginetype) {
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
		return "200kg";
	}

	public String getColor() {
		return "orange";
	}

	public String getMaker() {
		return "�ΰ�Ƽ";
	}

	public String getGengine() {
		return "�ξƾƾƾ�";
	}
}
