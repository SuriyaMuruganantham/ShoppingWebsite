import java.io.*; 
import java.sql.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
 
@WebServlet("/fetch") 
public class fetchproduct extends HttpServlet { 
	private static final long serialVersionUID = 1L; 
 
    public fetchproduct() { 
        super(); 
        // TODO Auto-generated constructor stub 
    } 
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub 
		response.getWriter().append("Served at: ").append(request.getContextPath()); 
	} 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub 
		//doGet(request, response); 
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
 
		String ID = request.getParameter("id"); 
		int id = Integer.parseInt(ID); 
         
		try { 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nproduct", "root", "Mysql@123"); 
			PreparedStatement ps = con.prepareStatement("select * from product where id=?"); 
			ps.setInt(1, id); 
 
			ResultSet rs = ps.executeQuery(); 
 
			while (rs.next()) { 
				out.println( 
						"Id: " + rs.getInt(1) + "</br> Name: " + rs.getString(2) + "</br> Category: " + rs.getString(3)+ "</br> LastUpdated: " + rs.getDate(4)); 
			} 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} finally { 
			out.close(); 
		} 
	 
	} 
 
} 