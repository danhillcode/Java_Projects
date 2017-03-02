

//package JdbcPostgresqlConnection;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;


    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
    import java.sql.DriverManager;
    import java.sql.Connection;
    import java.sql.SQLException;
    
     
    /**
     * This program demonstrates how to make database connection to PostgreSQL
     * server using JDBC.
     * @author www.codejava.net
     *java -cp /home/students/djh639/test/postgresql-9.4-1201.jdbc41.jar;/home/students/djh639/test JdbcPostgresqlConnection
     *home/students/djh639/test
     *https://www.mkyong.com/jdbc/how-do-connect-to-postgresql-with-jdbc-driver-java/
     */


    import java.sql.Connection;
    import java.sql.DriverManager;
    

    public class Connect{
       public static void main(String args[]) {
           
          
          Connection c = null;
         
            Statement stmt = null;
          try {
             Class.forName("org.postgresql.Driver");
             c = DriverManager
                .getConnection("jdbc:postgresql://mod-fund-databases/djh639","djh639", "21jkmqarvr");
                 
             stmt = c.createStatement();
             stmt.execute("INSERT INTO STUDENTS (firstname,lastname,dob,gender,course,login) VALUES ('Dan','Mother','19/11/1989','Male','CS',5555555555)");
             
             
             
          } catch (Exception e) {
             e.printStackTrace();
             System.err.println(e.getClass().getName()+": "+e.getMessage());
             System.exit(0);
          }
          System.out.println("Opened database successfully");
       }
    }