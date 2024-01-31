import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Servlet implementation class SumaServlet
 */
public class CarPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String customerName = request.getParameter("customerName");
        String mobileNumber = request.getParameter("mobileNumber");
        String pickupAddress= request.getParameter("pickupAddress");
        String dropAddress = request.getParameter("dropAddress");
        String pickupdate = request.getParameter("pickupdate");
        String pickupTime = request.getParameter("pickupTime");
        
        System.out.print(customerName+" "+mobileNumber+" "+pickupAddress+" "+dropAddress+" "+pickupdate+" "+pickupTime+" ");
        


        Hello1 obj = new Hello1(customerName,mobileNumber,pickupAddress,dropAddress,pickupdate,pickupTime);
        obj.store();
        response.sendRedirect("http://localhost:8080/Siva/3rd%20page%20N.html");
		doGet(request, response);
	}

}