package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FarenheitConverter;

/**
 * Servlet implementation class getTemperatureServlet
 */
@WebServlet("/getFarenheitServlet") // how to Call from page to servlet
public class getFarenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFarenheitServlet() 
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
		String temperatureConverted = request.getParameter("farenheitTemp"); // Retrieves what the user entered into the text box
		FarenheitConverter tempConvert = new FarenheitConverter(Integer.parseInt(temperatureConverted));
		
		request.setAttribute("farenheitConverted", tempConvert);
		getServletContext().getRequestDispatcher("/farenheitResult.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println("Testing the output: " + tempConvert.toString()); 
		writer.close();
	}

}

