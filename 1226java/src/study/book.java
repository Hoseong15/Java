package study;

public class book {

	static int cnt = 0; // Ŭ���� ����
	
	
	private String title; // �ν��Ͻ�����
	String writter; // �ν��Ͻ�����
	final int book_num = 0; // �ν��Ͻ�����
	
	
	public static int getCnt() {
		return cnt;
	}


	public static void setCnt(int cnt) {
		book.cnt = cnt;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWritter() {
		return writter;
	}


	public void setWritter(String writter) {
		this.writter = writter;
	}


	public int getBook_num() {
		return book_num;
	}


	book(){ // �����ڸ޼���
		
	}
	
	
	static void init() { // Ŭ�����޼���
		System.out.println("å ��� ����");
	}
	
	void create() { // �ν��Ͻ� �޼���
		System.out.println("å ���");
	}
	
}
//�ν��Ͻ������� �ν��Ͻ�(��ü)�����ؾ����� ����Ҽ� �ִ� ������.