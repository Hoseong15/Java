package thread_test1;

public class tes2 {

	public static void main(String[] args) {
		
		System.out.println("main메서드 push");
		Runnable r1 = new thread1();
		Thread th1 = new Thread(r1);
		th1.start();
		
		try{
			th1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main메서드 pop");
		
		
	}

}



class thread1 implements Runnable{
	@Override
	public void run() {
		System.out.println("쓰레드 1번 메서드 push");
		two();
		System.out.println("1번 pop");
	}
	public void two() {
		System.out.println("쓰레드 2번 메서드 push");
		three();
		System.out.println("2번 pop");
	}
	public void three() {
		System.out.println("쓰레드 3번 메서드 push");
		System.out.println("3번 pop");
	}
}