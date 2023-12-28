package homework;

public class suv extends car {

	private String driveType; // ÀÌ·û»ç·û ¼±ÅÃ

	public suv(int displacement, int weight, String color, String maker, String driveType, String name) {
		super(displacement, weight, color, maker,name);
		this.driveType = driveType;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}
	
	@Override
	public void brake() {}

	public String name() {
		return "»êÅ¸Æä";
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
		return "Çö´ë";
	}

	public String getDriveType() {
		return "ÀÌ·û or »ç·û";
	}



	
	
	
	
	
}
