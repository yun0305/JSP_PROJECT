package my_JSP.project.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex02")
public class ex02 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		for(int i=0;i<100;i++) {
			out.println((i+1)+": 안녕 Servlet<br>");
			/*<한글과 콘텐츠 형식 출력하기>
			 * 살행을 해보면 한글이 깨지는 것을 볼수 있다 이런 이유는
			 * 웹서버에서 클라이언트로 보내질때 웹서버애서 클라이언트로 보내지는 문서의 단위가
			 * IOS-8859-1 인코딩방식이다. 이럴경우 브라이저에 보내지는 문자열이 1바이트 단위로 쪼개지기 때문에 ?나온다
			 * (한글은 2바이트다)
			 *
			 * <서버에서 UTF-8로 인코딩해서 보냈지만 브라우저가 다른 문자셋으로 해석한 경우>
			 * 2바이트씩 보냈지만 브라우저가 문자셋이 달라서 깨지면 쀍꼷 <-이런식으로 나온다 
			 * 
			 * resp.setCharacterEncoding("UTF-8");
			 * 를 선언하면 보내줄때 UTF-8로 지정해서 문자를 보내줄수있다.
			 * 
			 * 그런데 UTF-8로 보내더라도 브라우저가 자의적으로 EUC-KR로 읽어들인다
			 * 그래서 응답헤더(Response 헤더)에 심어줘야 한다.
			 * resp.setContextType("text/html; charset=UTF-8"); 이런식으로 심어줄수 있다.
			 * 다시 개발자 도구로 ex02 파일의 헤더를 보면 아까는 없던 콘텐츠 타입이 보일것이다.
			 * 
			 */
		
		}
	
	
	}
}