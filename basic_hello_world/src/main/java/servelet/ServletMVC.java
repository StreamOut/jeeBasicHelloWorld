package servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
        name = "servletMVC",
        urlPatterns = "/lorem"
)
public class ServletMVC extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6759832949649376458L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		try {
			this.getServletContext().getRequestDispatcher("/seconde.jsp").forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
