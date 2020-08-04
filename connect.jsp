<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
String Accountnumber=request.getParameter("Account number");
String Beneficiary_Accountnumber=request.getParameter("Beneficiary_Account number");
String Remarks=request.getParameter("Remarks");
String Amount=request.getParameter("Amount");
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/
demo","student","student");
PreparedStatement ps= conn.prepareStatement("insert into statement(Description,Amount)");
ps.setString(1,Description);
ps.setInt(2,Amount);
int x=ps.executeUpdate();
if(x>0)
{
	out.println("Transfer Done Successfully");
}
else
{
	out.println("Invalid Access");
}
%>
