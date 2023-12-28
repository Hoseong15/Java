package homework;

public class main {

	public static void main(String[] args) {
//		sedan mySedan = new sedan(1500,2000, "쏘나타", "Blue", "현대", "Manual");
//
//		System.out.println("나의세단:" + mySedan.name());
//		System.out.println("배기량: " + mySedan.displacement());
//		System.out.println("차량무게: " + mySedan.weight());
//		System.out.println("차량색상: " + mySedan.getColor());
//		System.out.println("차량브랜드: " + mySedan.getMaker());
//		System.out.println("기어타입: " + mySedan.getTransmissionType());
//
//		mySedan.drive();

//		suv mySuv = new suv(1,1,"s","d","e","f");
//		
//		System.out.println("나의SUV:" + mySuv.name());
//		System.out.println("배기량: " + mySuv.displacement());
//		System.out.println("차량무게: " + mySuv.weight());
//		System.out.println("차량색상: " + mySuv.getColor());
//		System.out.println("차량브랜드: " + mySuv.getMaker());
//		System.out.println("이륜사륜인지 선택하세요: " + mySuv.getDriveType());
//		
//		mySuv.brake();

//		truck myTruck = new truck(3, 4, "c", "f", "y", "l");
//
//		System.out.println("나의SUV:" + myTruck.name());
//		System.out.println("배기량: " + myTruck.displacement());
//		System.out.println("차량무게: " + myTruck.weight());
//		System.out.println("차량색상: " + myTruck.getColor());
//		System.out.println("차량브랜드: " + myTruck.getMaker());
//		System.out.println("휠사이즈를 선택하세요: " + myTruck.getWheelSize());
//
//		myTruck.handle();
		
		
		supercar mySupercar = new supercar(3, 4, "c", "f", "y", "l");

		System.out.println("나의SUV:" + mySupercar.name());
		System.out.println("배기량: " + mySupercar.displacement());
		System.out.println("차량무게: " + mySupercar.weight());
		System.out.println("차량색상: " + mySupercar.getColor());
		System.out.println("차량브랜드: " + mySupercar.getMaker());
		System.out.println("엔진선택: " + mySupercar.getTransmissionType());

		mySupercar.engine();
	}

}
