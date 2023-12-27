package poly;

import inherit_test.house;

public class fan extends house {

	
	public static int makedate = 1227;
	public int sn = 1234;
	
	
	fan(){}
	fan(String brand){
		super(brand);
	}
	
	@Override
	 public void power() {
		onoff = !onoff;
	}
}
