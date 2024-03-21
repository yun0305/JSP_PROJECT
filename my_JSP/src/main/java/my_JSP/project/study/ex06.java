package my_JSP.project.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*<입력 내용이 많은 경우는 post요청>
 * 쿼리스트링으로 받을때 문제가있다 content로 받은 값은 textarea인데 쿼리스트링은
 * URL의 길이가 한정적이라서 길이에 제한이 있기때문이다.
 * 쿼리스트링은 옵션값이지 장문의 내용을 보낼때는 바람직하지 않다.
 * 
 * from 태그를 get이 아닌  post로 바꾸었다.
 * 
 * UTF-8은 기본적으로 멀티바이트 문자다 한글은 1개당 2바이트를 사용한다
 * 그래서 서버로 전달할때 서버에서 2바이트씩 읽어야하는데 그럴라면 보내는 쪽이 UTF-8이라고해도
 * 받는쪽이 문자셋이 다르면 한글이 깨진다
 * 
 * 그럼 한글이 깨지는 이유는 기본적으로 톰캣의 문자셋은 ISO-8859-1이다
 * ISO-8859-1은 문자1개를 1바이트로 인식하기 때문에 꺠짐문제가 발생한다. 
 * 
 * 지금 까지는 응답을 받는 쪽(브라으저)의 문자셋을 조정했다면(resp.setCharacterEncoding("UTF-8"))
 * 이번엔 요청을 전달받은(서버) 쪽의 문자셋을 조정해줘야 한다(req.setCharacterEncoding("UTF-8"))
 *
 * 단 사용자 입력을 읽어들이기 전에 선언해야 한다.
 * 
 * 
 */

@WebServlet("/ex06")
public class ex06 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; UTF-8");
		PrintWriter out = resp.getWriter();
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		out.println(title);
		out.println(content);
	
	}
	
}
