package servelet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "ServletCondition",
        urlPatterns = "/condition"
)
public class ServletCondition extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3852001205513250417L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		Map<String, String[]> parametres = req.getParameterMap();
		try {
			if(parametres.containsKey("prenom") && parametres.get("prenom").length > 0)
				this.getServletContext().getRequestDispatcher("/seconde.jsp").forward(req, resp);
			else 
				this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
