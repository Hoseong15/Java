package homework;

public class supercar extends car {
	private String 엔진;
	
	public supercar(int displacement, int weight, String color, String maker, String enginetype, String name) {
		super(displacement, weight, color, maker, name);
		this.엔진 = 엔진;
	}
	
	public void setEnginetype(String enginetype) {
		this.엔진=엔진;
	}
	
	@Override
	public void engine() {}
	
	public String name() {
		return "부가티";
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
		return "부가티";
	}

	public String getGengine() {
		return "부아아아앙";
	}
}
