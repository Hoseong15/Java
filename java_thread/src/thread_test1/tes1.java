package thread_test1;

public class tes1 {

	public static void main(String[] args) {
		myThread th1 = new myThread();
		th1.start(); // 쓰레드실행
		
		for(int i = 1; i<=10; i++) {
			System.out.println("main메서드 " + i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}    

class myThread extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("나는 쓰레드");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}


//	프로세스 - cpu에의해 실행중인 프로그램
//			 프로그램에 대한 정보를 가지고있다. 
//	쓰레드 - 프로세스 안에서 실직적으로 실행되는 단위
//	
//	단일 쓰레드 - 하나의 작업만 이루어지는 프로그램, 순차적 실행
//	멀티 쓰레드 - 여러 작업을 동시에 실행시키는 프로그램, 비동기
//	멀리 쓰레드 사용시 공유자원에 대해 주의해야한다.
//	공유자원 - 
