

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public product() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nproduct", "root", "Mysql@123");
            Statement selectStmt = connection.createStatement();
            ResultSet rs = selectStmt.executeQuery("SELECT product.Id,product.Category,price.Price from product INNER JOIN price ON product.Id=price.Id");
            PrintWriter out = response.getWriter();
            out.println("\n\nId\t\t\t\t \n\nCategory\t\t\t\t \n\nPrice\t\t\t\t");
		while(rs.next())
		{
			int Id=rs.getInt("Id");
			String Category=rs.getString("Category");
			int Price=rs.getInt("Price");
			out.println(Id+"\t\t\t\t"+Category+"\t\t\t\t"+Price+"\t\t\t\t\t");
					}
		

        }
            catch (Exception e) {
                e.printStackTrace();
            }   
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
