

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/servletlogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 if(request.getParameter("nickname") == null || request.getParameter("pass") == null) {
		 getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	 }
	 
	 String nickname = request.getParameter("nickname");
	 String pass = request.getParameter("pass");
	
	 request.setAttribute("nickname", nickname);
	 request.setAttribute("pass", pass);
	 
	 getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}
	

}
