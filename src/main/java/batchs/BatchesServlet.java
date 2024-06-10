package batchs;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*; 

@WebServlet("/BatchesServlet")
public class BatchesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       /*** the responsesetcontentype tells jave when reciving info send back to the front end user in a text html format**/
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	
    	/* so this next part is for the connection settings to the mysql*/
    	/*checkpoint from this point on im added the ground work and copying along with the code below*//
    	String url = "jdbc:mysql://localhost"
    	
    	
    }
    /****package batchs


@WebServlet("/BatchesServlet")
public class BatchesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Database connection settings
        String url = "jdbc:mysql://localhost:3306/new_registration"; // Replace with your database URL
        String user = "root"; // Replace with your database username
        String password = ""; // Replace with your database password

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the database
            con = DriverManager.getConnection(url, user, password);

            // Create a statement to execute SQL queries
            stmt = con.createStatement();

            // SQL query to retrieve data from the clients1 table
            String sql = "SELECT clients, slots FROM clients1";
            rs = stmt.executeQuery(sql);

            // Start HTML output
            out.println("<html><body>");
            out.println("<h2>Batch Details:</h2>");
            out.println("<ul>");

            // Process the result set
            while (rs.next()) {
                String clients = rs.getString("clients");
                String slots = rs.getString("slots");
                // Output the data as an HTML list item
                out.println("<li>" + clients + " - " + slots + "</li>");
            }

            // End HTML output
            out.println("</ul>");
            out.println("</body></html>");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close all the resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
****/
    
    
    
    
    
    
    
    
    
    
}