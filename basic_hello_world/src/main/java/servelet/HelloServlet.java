package servelet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletOutputStream;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;


@WebServlet(
        name = "MaServlet",
        urlPatterns = {"/hello", "/bonjour"}
)
public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1995527882880188364L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		try {
			ServletOutputStream servlet = resp.getOutputStream();
			servlet.println();
			servlet.println("Bonjour tous le monde!");
			servlet.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
