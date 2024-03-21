package my_JSP.project.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*<기본값 사용하기>
 * 클라이언트에서 쿼리스트링으로 값을 전달받을때
 * 
 * http://.../ex?cnt=3 넘겨받은 값 : "3" 문자열 3
 * http://.../ex?cnt=  넘겨받은 값 : ""	  빈문자열
 * http://.../ex?      넘겨받은 값 : null
 * http://.../ex	   넘겨받은 값 : null
 * 
 * 이런 4가지 방법으로 전달이 올건데 사용자가 null을 보내는것 허용하겠다고 하면 (물론 허용하지 않는다면 에러를 내면 된다.)
 * 묵시적으로 약속된 값이 있어야 한다.(약속한 값은 원하는값으로..)
 * 
 * 파라미터를 임시변수에 저장 해놓고 그 값을 조건문으로 null값인지 빈 문자열인지 검사를한다.
 * 
 */
@WebServlet("/ex04")
public class ex04 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; UTF-8");
		PrintWriter out = resp.getWriter();
		
//		int cnt = Integer.parseInt(req.getParameter("cnt")); 그냥 받아오면 당연히 NullPointerException이 발생한다.
		int cnt = 100;//기본값
		String cnt_ = req.getParameter("cnt");//임시번수에 쿼스리스트링 저장
		
		if(cnt_!=null && !cnt_.equals("")) {//쿼리스트링 검사
			cnt = Integer.parseInt(cnt_);// null값도 아니고 ""빈문자열도 아니라면 전달값을 cnt변수에 저장 
		}
	
		for(int i=0;i<cnt;i++) {
			out.println((i+1)+": 안녕 Servlet <br>");
		}
		//이번엔 웹 주소에서 쿼리스트링을 보내지 않고 html코드에서 a태그로 쿼리스트링을 보내줄거다.
	}
}
