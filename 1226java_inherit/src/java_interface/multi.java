package java_interface;

public class multi {

	public static void main(String[] args) {

		UsbCable u = new keyboard();
		u.plugNplay();
		u.keyValue();
		
		Bluetooth b = new keyboard();
		b.SetBluetooth();
		b.keyValue();
		
		Wifi w = new keyboard();
		w.DirectWifi();
		w.keyValue();
	}

}

interface Passing{
	public void keyValue(); // Ű���� �� �޾ƿ���
}

interface UsbCable extends Passing{
	public void plugNplay();
}

interface Bluetooth extends Passing{
	public void SetBluetooth();
}

interface Wifi extends Passing{
	public void DirectWifi();
}

class keyboard  implements UsbCable, Bluetooth, Wifi{
	
	@Override
	public void keyValue() {
		System.out.println("Ű���� �� ����");
	}
	
	@Override
	public void plugNplay() {
		System.out.println("������ �ٷ� ��밡��");
	}
	@Override
	public void SetBluetooth() {
		System.out.println("������� �����Ͽ� ����ϸ� ��밡��");
	}
	@Override
	public void DirectWifi() {
		System.out.println("���̷�Ʈ �������� Ȱ��ȭ�ؼ� ���� �� ���");
	}
}


//	�ڹ��� ���߻��
//	�ڹٿ��� Ŭ�������� ����� ���� ��Ӹ� �����ϴ�.
//	�ڹٿ��� ���߻���� �������̽����� ����Ѵ�.
//	���߻���� ���ؼ� �پ��� �������� ������ �� �ִ�.		
//	
//	Ű���� �����ߴ�.
//	��ǻ�Ϳ� ���� ��� - USB, �������, ���ù�, wifi
//	