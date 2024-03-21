package my_JSP.project.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03")
public class ex03 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; UTF-8");
		
		PrintWriter out = resp.getWriter();
		int cnt = Integer.parseInt(req.getParameter("cnt"));
		
		for(int i=0;i<cnt;i++) {
			out.println((i+1)+": 안녕 Servlet<br>");
			
			/*<get 요청과 쿼리스트링>
			 * req.getParameter();로 이번에는 쿼리스트링으로 받은 파라미터값을 읽어와서 그걸로 반복문을 3번 돌려볼것이다
			 * 주의할 점은 받아오는 파라미터값은 문자열이기 때문에 원하는 데이터 타입으로 파싱해줘야 한다. 
			 * 
			 * 웹 주소 맨뒤에 ?키=값 으로 주소에 붙여서 인자값을 보내줘 보자
			 */
		}
	}
	
}
