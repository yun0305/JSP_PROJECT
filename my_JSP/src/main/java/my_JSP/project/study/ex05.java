package my_JSP.project.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//사용자 입력을 통한 get요청
@WebServlet("/ex05")
public class ex05 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		int cnt = 100;
		String cnt_ = req.getParameter("cnt");
		
		if(cnt_!=null&&!cnt_.equals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		
		for(int i=0;i<cnt;i++) {
			out.println((i+1)+": 안녕 Servlet<br>");
		}
		
	}
	
}
