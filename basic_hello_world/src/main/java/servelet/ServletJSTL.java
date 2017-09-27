package servelet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "ServletJSTL",
        urlPatterns = "/jstl"
)
public class ServletJSTL extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3190065119457264110L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		Map<String, String[]> parametres = req.getParameterMap();
		String prenom ="inconnu(e)", pays ="aucun";
		try {
			if(parametres.containsKey("prenom") && parametres.get("prenom").length > 0)
				prenom = parametres.get("prenom")[0];	
			if(parametres.containsKey("pays") && parametres.get("pays").length > 0)
				pays = parametres.get("pays")[0];
			req.setAttribute("prenom", prenom);
			req.setAttribute("pays", pays);
			this.getServletContext().getRequestDispatcher("/jstl.jsp").forward(req, resp);
			
			
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}