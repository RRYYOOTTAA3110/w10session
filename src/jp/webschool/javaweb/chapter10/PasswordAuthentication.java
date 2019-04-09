package jp.webschool.javaweb.chapter10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PasswordAuthenticaton
 */
public class PasswordAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String id = "webschool";
	private String password = "webschool";

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		//セッションの作成（取得）
		HttpSession session = request.getSession(true);

		if(this.id.equals(id) && this.password.equals(password)){
			//ログインが成功した場合
			session.setAttribute("status", "login");
			session.setAttribute("id", id);
			response.sendRedirect("/w10session/page1.jsp");
		}else{
			//ログインが失敗した場合
			session.setAttribute("status", "logout");
			response.sendRedirect("/w10session/loginForm.jsp");
		}
	}

}