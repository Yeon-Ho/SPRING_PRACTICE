package common.interceptor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

// HandlerInterceptor를 구현해 인터페이스로 해당 클래스를 활용
public class AuthInterceptor implements HandlerInterceptor{

	// Interceptor
	//	DispatcherServlet이 Controller의 메소드를 호출할 때 요청을 가로채어 선작업 가능
	
	// Filter
	//	Servlet Container가 Servlet을 호출하기 전에 요청을 가로채는 역할
	
	// Servlet Container > Filter > Dispatcher Servlet > Interceptor > Controller
	
	@Override
	// preHandle : Controller로 요청이 가기 전에 실행되는 메소드
	//	return true : Controller의 메소드가 실행된다.
	//	return false : Controller의 메소드가 실행되지 않는다.
	//	object handler : preHandle을 수행, 수행될 컨트롤러 메소드에 대한 정보 담김
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws ServletException, IOException {
		
		if(req.getRequestURI().contains("notice/")
				&& req.getSession().getAttribute("logInInfo") == null) {
			req.setAttribute("alertMsg", "비회원은 접근할 권한이 없습니다.");
			req.setAttribute("url", req.getContextPath()+"/member/login.do");
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
			rd.forward(req, resp);
			
			// 컨트롤러 메소드를 호출하지 않음
			return false;
		} else {
			return true;
		}
	}
	
}
