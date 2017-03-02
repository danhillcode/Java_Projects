//package JdbcPostgresqlConnection;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
 
import au.com.bytecode.opencsv.CSVReader;
 
public class Reader
{
  
	//Inserts and creates the artists table
	public static void statements1() throws FileNotFoundException, SQLException, ClassNotFoundException{
    	   
    	 //DATABASE CONNECTION
    	 
    	 Connection c = null;
	    Statement stmt = null;
         
  	        try {
  	         
  	         Class.forName("org.postgresql.Driver");
  	         c = DriverManager
  	            .getConnection("jdbc:postgresql://mod-fund-databases/djh639","djh639", "21jkmqarvr");
  	      
  	         stmt = c.createStatement();
  	       System.out.println("Creating table in given database...");
  	   
  	       
  	       
			// Adds the serial
			  String sql = "CREATE TABLE Artists " + "(id serial primary key," +
			  " artist_name TEXT not NULL, " + "  album_name TEXT not NULL, " +
			  "  Tag_ID INTEGER not NULL )" ;
			  
			  
			  String sql1 = "CREATE TABLE Albums " + "(id INTEGER not NULL, " +
			  " album_name TEXT not NULL, " + "  Tag_ID INTEGER not NULL, " +
			  " PRIMARY KEY ( id ))";
			  
			  String sql2 = "CREATE TABLE Songs " + "(id INTEGER not NULL, " +
			  " song_name TEXT not NULL, " + " Album_ID INTEGER not NULL, " +
			  " Tag_ID INTEGER not NULL, " + " PRIMARY KEY ( id ))";
			  
			  String sql3 = "CREATE TABLE Tags " + "(id INTEGER not NULL, " +
			  " tag_description TEXT not NULL, " +
			  " song_ID INTEGER not NULL, " + " album_ID INTEGER not NULL, " +
			  " PRIMARY KEY ( id ))";
  	    //execute create tables
  	     stmt.executeUpdate(sql);
  	     //stmt.executeUpdate(sql1);stmt.executeUpdate(sql2);stmt.executeUpdate(sql3);
  	      System.out.println("Created table in given database...");
  	   
  	      
  	   
  	   
  	      //Drop all tables
  	   //stmt.execute("DROP TABLE Tags");stmt.execute("DROP TABLE Songs");stmt.execute("DROP TABLE Albums");
  	   //stmt.execute("DROP TABLE Artists");
  	   System.out.println("Created ID in given database...");
  	        }
  	         
  	 catch (Exception e) {
  		 e.printStackTrace();
  		 System.err.println("error");
  		 System.exit(0);
  	 }
  	 System.out.println("Opened");
     
  	 
  	//READ IN CSV FILE
	 CSVReader reader = new CSVReader(new FileReader("artists-songs-albums-tags(1).csv"), ',' , '"' , 1);
		// Read CSV line by line and use the string array as you want
		String[] nextLine;
		int id = 0;
		try {
			while ((nextLine = reader.readNext()) != null) {

				
				System.out.println("filling table");
				System.out.println(nextLine[1]);
				
				String artist_name = nextLine[1];
				String album_name = nextLine[2];
				int Tag_ID = id + 1;
				
				PreparedStatement pst = null;
	  	        
				
	  	        
	  	        //prepared INSERT statement
	  	        String stm = "INSERT INTO Artists (artist_name,album_name,Tag_id) VALUES(?, ?, ?)";
	  	        pst = c.prepareStatement(stm);
	  	        pst.setString(1, artist_name);
	  	        pst.setString(2, album_name);
	  	        pst.setInt(3, Tag_ID);
	  	        pst.executeUpdate(); 
	  	        
	  	       // stmt.execute("INSERT INTO Albums (album_name,tag_ID) VALUES (album_name,tag_id)");
	  	         
	  	        
				
				

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         
  	 
     
}
  	      
  	
          
          
     	 
  	      
  	      
  	   

     
     
     public static void main(String[] args) throws SQLException, FileNotFoundException, ClassNotFoundException{
   
    	
			statements1();
     }
}
//psql -h mod-fund-databases
//21jkmqarvr
//SELECT * FROM albums;
// SELECT * FROM artists;
