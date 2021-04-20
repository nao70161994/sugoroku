package sugoroku;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SugorokuServlet
 */
@WebServlet("/SugorokuServlet")
public class SugorokuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int i =0;

    /**
     * Default constructor. 
     */
    public SugorokuServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.i=0;
		
		String prace ="";
		
		prace +="①";
		
		request.setAttribute("foo", prace);
		
		String view = "/WEB-INF/Sugorku.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);

	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand = new Random();
		this.i += rand.nextInt(6) + 1;
		String prace ="";
		if(i<20){
			for(int a=0; a < this.i; a++) {
			prace += "ロ";
			}
		}else {
			for(int a=0; a < 20; a++) {
			prace += "ロ";
			}
		}
		
		prace +="①";
		
		request.setAttribute("foo", prace);
		
		String view = "/WEB-INF/Sugorku.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);

	    dispatcher.forward(request, response);
	}

}
