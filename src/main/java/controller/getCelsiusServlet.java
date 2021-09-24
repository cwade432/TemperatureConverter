package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CelsiusConverter;

/**
 * Servlet implementation class getCelsiusServlet
 */
@WebServlet("/getCelsiusServlet")
public class getCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsiusServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String temperatureConverted = request.getParameter("celsiusTemp"); // Retrieves what the user entered into the text box
		CelsiusConverter tempConvert = new CelsiusConverter(Integer.parseInt(temperatureConverted));
		
		request.setAttribute("celsiusConverted", tempConvert);
		getServletContext().getRequestDispatcher("/celsiusResult.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println("Testing the output: " + tempConvert.toString()); 
		writer.close();
	}

}
