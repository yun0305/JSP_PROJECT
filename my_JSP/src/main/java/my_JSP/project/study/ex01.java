package my_JSP.project.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01")
public class ex01 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		for(int i=0;i<100;i++) {
			
			out.println((i+1)+": Hello Servlet");
			/*<서블릿 출력 형식을 지정해야 하는 이유>
			 * 아무리 코드상에서 println으로 내려쓰기를 했더라도 브라우저에서는 한줄로 나와야 정상이다.(브라우저마다 다를수 있다.)
			 * 
			 * 엣지 같은 경우는 한줄로 표현했고 클롬은 내려쓰기로 출력해줬다 이런이유는
			 * 브라우저에 컨텐츠 형식을 알려주지 않을경우 브라우저가 자의적으로 해석하기 때문이다. 
			 * 
			 * 우리가 어떤  내용을 클라이언트에게 보낼때에는 어떤한 형식의 문서인지를 알려줘야 한다.
			 * 그렇지 않으면 자의적으로 해석한다.
			 * 
			 * 엣지는 html로 해석하고 크롬은 text문서로 해석한다.
			 * 
			 * 
			 * 
			 */
		}
		
	}
	

}
