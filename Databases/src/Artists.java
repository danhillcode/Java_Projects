


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
import java.util.HashMap;

import com.opencsv.CSVReader;
	 
	public class Artists {
	
	  
		//Inserts and creates the artists table
		public static void statements1() throws FileNotFoundException, SQLException, ClassNotFoundException{
	    	   
	    	 //DATABASE CONNECTION
	    	 
	    	 Connection c = null;
		    Statement stmt = null;
	         
	  	        try {
	  	         
	  	         Class.forName("org.postgresql.Driver");
	  	         c = DriverManager
	  	            .getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639","djh639", "21jkmqarvr");
	  	      
	  	         stmt = c.createStatement();
	  	       
	  	       System.out.println("Creating table in given database...");
	  	   
	  	       
	  	     stmt.execute("DROP TABLE Artists");
				// Adds the serial
				  String sql = "CREATE TABLE Artists " + "(id serial UNIQUE primary key," +
				  " artist_name TEXT not NULL )"; 
						  //+ "  Album_ID TEXT not NULL )" ;
				  //foreign key = id of another table
				  
	  	    //execute create tables
	  	     stmt.executeUpdate(sql);
	  	     //stmt.executeUpdate(sql1);stmt.executeUpdate(sql2);stmt.executeUpdate(sql3);
	  	      System.out.println("Created table in given database...");

	  	   
	  	   System.out.println("Created ID in given database...");
	  	        }
	  	         
	  	 catch (Exception e) {
	  		 e.printStackTrace();
	  		 System.err.println("error");
	  		 System.exit(0);
	  	 }
	  	 System.out.println("Opened");
	  	 
	  	 
	  	 
	  	 
	  	 
	     
	  	 
	  	//READ IN CSV FILE
		 CSVReader reader = new CSVReader(new FileReader("lib/artists-songs-albums-tags.csv"), ',' , '"' , 1);
			// Read CSV line by line and use the string array as you want
			String[] nextLine;
			int id = 0;
			HashMap<Integer, String> hmap = new HashMap<Integer, String>();

			try {
				while ((nextLine = reader.readNext()) != null) {
					id = id + 1;
					
					System.out.println("filling table");
					System.out.println(nextLine[1]);
					
					String artist_name = nextLine[1];
					String album_name = nextLine[2];
					
					
					
					PreparedStatement pst = null;
					
					if(hmap.containsValue(nextLine[1])){
						System.out.println(nextLine[1]);
						System.out.println("Already in list");
					}
					else{
						hmap.put(id,nextLine[1]);
		  	        		  
					//id serial UNIQUE primary key," +
					  //" artist_name UNIQUE TEXT not NULL, " + "  Album_ID TEXT not NULL, " +
					  //"  Tag_ID INTEGER not NULL )" ;
		  	        
		  	        //prepared INSERT statement
		  	        String stm = "INSERT INTO Artists (artist_name) VALUES(?)";
		  	        pst = c.prepareStatement(stm);
		  	        pst.setString(1, artist_name);
		  	       
		  	       // pst.setString(2, album_name);
		  	        
		  	        pst.executeUpdate(); 
					}

		  	        
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
