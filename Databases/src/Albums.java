//package JdbcPostgresqlConnection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;

import com.opencsv.CSVReader;

public class Albums {

	static HashMap<String, String> others = new HashMap<String, String>();
	// Inserts and creates the artists table
	public static void statements1() throws SQLException, ClassNotFoundException, IOException {

		// DATABASE CONNECTION
		Connection c = null;
		Statement stmt = null;

		try {

			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639", "djh639",
					"21jkmqarvr");

			stmt = c.createStatement();
			//stmt.execute("DROP TABLE Albums");
			System.out.println("Creating table in given database...");

			String sql1 = "CREATE TABLE Albums " + "(id serial primary key, " + " album_name  TEXT not NULL, "
					+ "  artist_id TEXT not NULL )";

			// execute create tables
			stmt.executeUpdate(sql1);
			System.out.println("Created table in given database...");

			System.out.println("Created ID in given database...");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.err.println("error");
			System.exit(0);
		}
		System.out.println("Opened");

		//opened database
		
		
		
		HashMap<String, String> keys = new HashMap<String, String>();

		
		String query = "SELECT * FROM artists";
		// create the java statement
		Statement st = c.createStatement();
		// execute the query, and get a java resultset
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			String id1 = rs.getString("id");
			String artist = rs.getString("artist_name");
			System.out.println(id1);
			System.out.println(artist);
			keys.put(artist, id1);
			System.out.println(keys);
			
			
			/*
			String stm = "INSERT INTO Albums (album_name,artist_id) VALUES(?, ?)";
			PreparedStatement pst = null;
			pst = c.prepareStatement(stm);
			pst.setString(1, id1);
			pst.setString(2, artist);
			
			pst.executeUpdate();
			*/
			
			

			
			
	
			
		}
	   st.close();

		
		
		
		// READ IN CSV FILE
		CSVReader reader = new CSVReader(new FileReader("lib/artists-songs-albums-tags.csv"), ',', '"', 1);
		// Read CSV line by line and use the string array as you want
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		String[] nextLine;
		int id = 0;
		PreparedStatement pst = null;

		try {
			while ((nextLine = reader.readNext()) != null) {

				// read all into a hashmap and then do a check to see if in
				// hashmap do the prepared statement then prepared statement

				
				
				 System.out.println("filling table");
				 System.out.println(hmap);
				id = id + 1;

				String album_name = nextLine[2];
				String artist_name = nextLine[1];

				

				if (hmap.containsValue(nextLine[2]) && hmap.containsKey(nextLine[1])) {
					// System.out.println(nextLine[2]);
					// System.out.println(nextLine[1]);
					System.out.println("Already in list");
				} else {

					// artist_name and album_name
					hmap.put(nextLine[1], nextLine[2]);
					others.put(nextLine[0],nextLine[2]);

					String stm = "INSERT INTO Albums (album_name,artist_id) VALUES(?, ?)";
					pst = c.prepareStatement(stm);
					pst.setString(1, album_name);

					// change variable name to artist id
					artist_name = keys.get(artist_name);
					System.out.println(artist_name);
					pst.setString(2, artist_name);

					pst.executeUpdate();

				}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	
	
	}
	
/*
 * Main method to called methods in the class
 */
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

		statements1();
	}
}




