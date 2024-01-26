package control;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.board.board_action;

/**
 * Servlet implementation class board_control
 */
@WebServlet("/board_control")
public class board_control extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, board_action> target = new HashMap<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public board_control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/board");
		Enumeration key = rb.getKeys();
		while(key.hasMoreElements()) {
			String k = (String)key.nextElement(); // signup,signSave,myPage...등등
			String value = rb.getString(k); // member.properties의 키에 맞는 value 가져오기
			try {
				Class<?> hc1 = Class.forName(value); // 클래스를 로드(객체생성하려면 메모리에 로드 되어야한다.)
				board_action hinst = ( board_action)hc1.newInstance(); // 객체생성
				target.put(k, hinst);
				
			}catch(Exception e) {
				System.out.println("board.properties 파일 작업 실패");
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버는 대부분 사용자의 주소요청에 동작한다. 주소요청이 없으면 대부분 동작하지않는다.
		// 사용자가 요청한 주소를 보고 그에 맞는 응답 페이지 제공이나 값을 제공한다.
		// 서블렛은 사용자의 요청을 목젝에 맞게 처리하기위한 클래스이다.
		// 서버 대신해서 요청을 처리해주는 역할을 한다.
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		
		
		String cmd = uri.substring(1); // 요청 주소의 cmd 파라미터 값 가져오기
		String view = "/"; // 사용자에게 제공 할 기본 페이지
		
		board_action mem = target.get(cmd);
		
		view = mem.action(request, response);
		
		if(view != null) {
			RequestDispatcher rds = request.getRequestDispatcher(view); // 제공 할 페이지
			rds.forward(request, response); 
			// 기존의 사용자 브라우저의 내용을 교체하는 방식
			// 주소는 변경되지않는다.
		}
	}


}
