/*Minayo Kawamura
 * Lab17
 * 12/5/2020*/
package lab17;
import java.sql.*;


public class lab17 {

	public static void main(String[] args) {

		try {
			 Connection conn = DriverManager.getConnection(               
					 "jdbc:oracle:thin:@cis-data.student.directory.jccc:1521:cisdata", "mkawamur", "mk7092");      
			 System.out.println("connected!");
			 
			 //1
			 Statement statement = conn.createStatement();
			 ResultSet rs = statement.executeQuery("SELECT last_name, first_name FROM student.student WHERE last_name LIKE 'Z%' OR last_name LIKE 'Y%' ORDER BY 1");
			 while (rs.next())
			 {
				 String last = rs.getString("last_name");
				 String first = rs.getString("first_name");
				 System.out.println(last + ", " + first);
			 }
			 
			 //2
			 int counter = 0;
			 ResultSet rs2 = statement.executeQuery( "SELECT * FROM S_EMPLOYEE_COPY");
			 while(rs2.next())
			 {
				 counter += 1;
			 }
			 String deleteStatement = ("DELETE FROM S_EMPLOYEE_COPY");
			 statement.executeUpdate(deleteStatement);
			 System.out.println(counter + " rows deleted.");
			 
			 //3
			 String insertStatement = ("INSERT INTO S_EMPLOYEE_COPY (EMPLOYEE_ID, NAME, SALARY, TITLE)" + "VALUES(1,'Bill', 12345, 'Manager')");
			 String insertStatement2 = ("INSERT INTO S_EMPLOYEE_COPY (EMPLOYEE_ID, NAME, SALARY, TITLE)" + "VALUES(2,'Mary', 54321, 'Director')");
			 statement.executeUpdate(insertStatement);
			 statement.executeUpdate(insertStatement2);
			 ResultSet rs3 = statement.executeQuery("SELECT * FROM S_EMPLOYEE_COPY");
			 int counter2 = 0;
			 while(rs3.next())
			 {
				 counter2 += 1;
			 }
			 System.out.println(counter2 + " rows added.");
			 
			 //4
			 String updateStatement = ("UPDATE S_EMPLOYEE_COPY" + " SET SALARY = 35000, TITLE = 'DBA'" + " WHERE NAME = 'Bill'");
			 statement.executeUpdate(updateStatement);
			 ResultSet rs4 = statement.executeQuery("SELECT * FROM S_EMPLOYEE_COPY WHERE NAME = 'Bill'");
			 int counter3 = 0;
			 while(rs4.next())
			 {
				 counter3 += 1;
			 }
			 System.out.println(counter3 + " rows affected.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
