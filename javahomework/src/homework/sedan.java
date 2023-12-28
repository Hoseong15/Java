package homework;

class sedan extends car {
	private String gear; // 기어 수동

	public sedan(int displacement, int weight, String color, String maker, String transmissionType, String name) {
		super(displacement, weight, color, maker, name);
		this.gear = gear;
	}

	public void setTransmissionType(String transmissionType) {
		this.gear = transmissionType;
	}

	@Override
	public void drive() {}

	public String name() {
		return "소나타";
	}

	public String displacement() {
		return "2500cc";
	}

	public String weight() {
		return "250kg";
	}

	public String getColor() {
		return "blue";
	}

	public String getMaker() {
		return "현대";
	}

	public String getTransmissionType() {
		return "수동";
	}

	
	

}
