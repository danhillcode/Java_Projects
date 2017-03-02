import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.opencsv.CSVReader;

public class Questions_Table {
	static ArrayList<String> question = new ArrayList<String>();
	static ArrayList<String> answer1 = new ArrayList<String>();
	static ArrayList<String> answer2 = new ArrayList<String>();
	static ArrayList<String> answer3 = new ArrayList<String>();
	static ArrayList<String> correct_answer = new ArrayList<String>();

	public static void createTableQuestions() throws FileNotFoundException, SQLException, ClassNotFoundException, IOException {

		// DATABASE CONNECTION
		Connection c = null;
		Statement stmt = null;

		try {

			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639", "djh639",
					"21jkmqarvr");

			stmt = c.createStatement();
			System.out.println("Creating table in given database...");

			stmt.execute("DROP TABLE Questions");
			// Adds the serial
			String sql = "CREATE TABLE Questions " + "(id serial UNIQUE primary key," + " question_description TEXT not NULL, "
					+ "  Answer1 TEXT not NULL, " +  "Answer2 TEXT not NULL," +  "Answer3 TEXT not NULL," +  "Correct_Answer TEXT not NULL )";
			// foreign key = id of another table

			// execute create tables
			stmt.executeUpdate(sql);
			// stmt.executeUpdate(sql1);stmt.executeUpdate(sql2);stmt.executeUpdate(sql3);
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
				CSVReader reader = new CSVReader(new FileReader("lib/Questions - Sheet1.csv"), ',' , '"' , 1);
				// Read CSV line by line and use the string array as you want
				String[] nextLine;

				int id = 1;
				try {
					while ((nextLine = reader.readNext()) != null) {

						question.add(nextLine[0]);
						answer1.add(nextLine[1]);
						answer2.add(nextLine[2]);
						answer3.add(nextLine[3]);
						correct_answer.add(nextLine[4]);
						


						System.out.println(nextLine[0]);
						System.out.println(nextLine[1]);
						System.out.println(nextLine[2]);
						System.out.println(nextLine[3]);
						System.out.println(nextLine[4]);
						
						
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
	
	public static void enterQuestions() throws SQLException{
		
		Connection c1 = DriverManager
				.getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639","djh639", "21jkmqarvr");

		for(int i = 0; i < question.size(); i++){
		String sql =  "INSERT INTO Questions (question_description,Answer1,Answer2,Answer3,Correct_Answer) VALUES(?, ?,?,?,?)";
		PreparedStatement pst2 =  c1.prepareStatement(sql);
		
		
		
		//String stm = "INSERT INTO Songs (song_name, album_id) VALUES(?, ?)";
		pst2 = c1.prepareStatement(sql);
		pst2.setString(1, question.get(i) );
		//OPEN
		pst2.setString(2,  answer1.get(i));
		pst2.setString(3,  answer2.get(i));
		pst2.setString(4,  answer3.get(i));
		pst2.setString(5,  correct_answer.get(i));
		pst2.executeUpdate(); 
		//stm.close();
		}
	}
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
	
		createTableQuestions();
		enterQuestions();
	}

}

