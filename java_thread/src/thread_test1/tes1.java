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
		
		Runnable th2 = new thread2();
		Thread th22 = new Thread(th2);
		th22.start();
		
	}

}    


class thread2 implements Runnable{
	@Override
	public void run() {
		System.out.println("나는 인터페이스로 작업한 쓰레드일껄?");
//		for(int i = 1; i <=9; i++) {
//			System.out.println("5 * "+i+" = "+ 5*i);
//		}
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

//	쓰레드 관련 메서드
//	run() : 쓰레드의 실행코드가 작성되는 메서드 -쓰레드 stack first input
//	start() : 쓰레드가 시작되도록 요청하는 메서드 - run 메서드를 호출한다.
//	sleep() : 지정한 시간동안 현재 쓰레드를 일시중시 시킨다.
//	join()  : 현재 쓰레드가 끝날때까지 기다린다.
//	yield() : 현재 쓰레드의 실행 시간을 다른 쓰레드에게 양보한다.

//	데몬쓰레드 - 주 쓰레드의 작업을 보조하는 쓰레드
//			  주 쓰레드가 종료되면 강제적으로 종료된다.



