package thread_test1;

public class test3 {

	public static void main(String[] args) {
		Runnable r1 = new yield_th();
		Thread th1 = new Thread(r1);
		th1.start();
		for(int i = 1; i<=10; i++) {
			System.out.println("main메서드" + i);
			
			if(i == 7) yield_th.isOk = true;
			try {Thread.sleep(1000);}
			catch(Exception e) {e.printStackTrace();}
		}

	}

}

class yield_th implements Runnable{
	static boolean isOk = false;
	
	@Override
	public void run() {
		int i = 1;
		while(true) {
			if(isOk) {
				System.out.println("쓰레드 작업시작한다!");
			}else {
				Thread.yield();
			}
			
			
			System.out.println("2번쨰 쓰레드" + i);
			i++;
			try{Thread.sleep(1000);}
			catch(Exception e) {e.printStackTrace();};
		}
	}
}
