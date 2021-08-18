
package za.ac.cput.project2databasetask;
import java.sql.*;

/**
 *
 * ELVIS NDLANGAMANDLA
 * GROUP 31
 * STUDENT NO: 213063964
 * PROJECT 2: TERM 3 TASK
 */
public class ProjectSQLAndDatabase {

   
public static void main(String[] args) {
        // This is a Project 2 task
    String create_Table_table="create table Customer (Customer_ID INTEGER, Name VARCHAR(20))";
    String insert_Values_insertV="insert into Customer values   (10410045,'Amanda AL')";
    String update_Values_updateV="UPDATE Customer SET NAME ='PEGGY'      WHERE Customer_ID=100";
    String delete_Values_deleteV="DELETE FROM Customer WHERE    Student_ID =   50";
    String retrieve_Values_retrieveV="SELECT * FROM Customer ";    

  try {
        String dbURL = "jdbc:derby://localhost:1527/FoodMenu";
        String username = "Administrator";
        String password = "Elvisep@12345";
       
       
        System.out.println("About to get a connection....");
        Connection con = DriverManager.getConnection(dbURL, username, password); 
        System.out.println("Connection Established Successfully....");
        
        System.out.println("Creating statement Object....");
        Statement s = con.createStatement();   
        System.out.println("Statement object created Successfully....");
       
        System.out.println("About to execute SQL stmt....");
        s.executeUpdate(insert_Values_insertV); // execute the SQL statement
        


System.out.println("SQL statement executed  Successfully....");

        System.out.println("About to close Statement....");
        s.close(); // close the Statement to let the database know we're done with it
        con.close(); // close the Connection to let the database know we're done with it
        System.out.println("Statement closed successfully....");
    }
        catch (Exception err) {
        System.out.println("ERROR: " + err);
    }
}
    }
    

