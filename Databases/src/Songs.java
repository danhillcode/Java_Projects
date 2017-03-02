

//package JdbcPostgresqlConnection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import com.opencsv.CSVReader;

public class Songs extends Albums {

	//static TreeMap<String, String> keys = new TreeMap<String, String>();
	static ArrayList<String> album = new ArrayList<String>();
	static ArrayList<String> song = new ArrayList<String>();
	static ArrayList<String> album_ID = new ArrayList<String>();
	static HashMap<String, String> keys = new HashMap<String, String>();


	//Inserts and creates the artists table
	/**
	 * @throws FileNotFoundException
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void statements1() throws FileNotFoundException, SQLException, ClassNotFoundException{

		//DATABASE CONNECTION

		Connection c = null;
		Statement stmt = null;

		try {

			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639","djh639", "21jkmqarvr");

			stmt = c.createStatement();
			stmt.execute("DROP TABLE Songs");
			System.out.println("Creating table in given database...");

			String sql2 = "CREATE TABLE Songs " + "(id serial UNIQUE primary key, " +
					" song_name Text not NULL, " + " album_id Text not NULL )" ;



			//execute create tables
			stmt.executeUpdate(sql2);
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


		/*
		 * SQL query for the artist if it matches a song ID
		 */

		PreparedStatement pst = null;
		Statement st = c.createStatement();




		


		
		String query = "SELECT * FROM artists1";
		// create the java statement
		
		
		
		//READ IN CSV FILE
		CSVReader reader = new CSVReader(new FileReader("lib/artists-songs-albums-tags.csv"), ',' , '"' , 1);
		// Read CSV line by line and use the string array as you want
		String[] nextLine;


		int id = 1;
		try {
			while ((nextLine = reader.readNext()) != null) {

				String song_name = nextLine[0];
				String album_name = nextLine[2];
				song.add(song_name);
				album.add(album_name);
				
				//search database table albums where album_id = album_id(variable) bring back id
				
				
				
				
				
				
				
			}

			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("Arrays");
		}

	}

	/*
	 * This method gets the albums array from the previous method. It uses the array to find the corresponding id and album_name  
	 */
	public static void statements2() throws FileNotFoundException, SQLException, ClassNotFoundException{
		
		Connection c1 = DriverManager
				.getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639","djh639", "21jkmqarvr");

		for(int i = 0; i < album.size(); i++){
		String sql = "SELECT * FROM albums where album_name = (?) ";
		PreparedStatement pst1 =  c1.prepareStatement(sql);
		pst1.setString(1, album.get(i));
		System.out.println(song.get(i));
		
		//pst1.executeUpdate();
		//pst1.close();
		ResultSet rs = pst1.executeQuery();
		
		
		
		
		while (rs.next()) {
			//returned items
			String id1 = rs.getString("id");
			String album_name = rs.getString("album_name");
			
			album_ID.add(id1);
			System.out.println("This is the album id: " + id1);
			System.out.println("this is the song: " + song.get(i));
			System.out.println("this is: " + album_name);
			
			
			/*if(keys.containsKey(id1)){
				System.out.println("Already in..");
			}else{
			keys.put(id1, album_name);
			}
			*/
		}
		pst1.close();
		}
		System.out.println(song);
		
		}
		
	
		public static void entry() throws SQLException{
			
			Connection c1 = DriverManager
					.getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639","djh639", "21jkmqarvr");

			for(int i = 0; i < song.size(); i++){
			String sql =  "INSERT INTO Songs (song_name, album_id) VALUES(?, ?)";
			PreparedStatement pst2 =  c1.prepareStatement(sql);
			
			//String stm = "INSERT INTO Songs (song_name, album_id) VALUES(?, ?)";
			pst2 = c1.prepareStatement(sql);
			pst2.setString(1, song.get(i));
			//OPEN
			pst2.setString(2, album_ID.get(i));
			pst2.executeUpdate(); 
			//stm.close();
			}
		}
		
		
		
	
		
	


	public static void main(String[] args) throws SQLException, FileNotFoundException, ClassNotFoundException{

		statements1();
		statements2();
		System.out.println(album_ID.get(551));
		entry();
		
	}	
}
