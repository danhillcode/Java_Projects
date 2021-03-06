import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Users_Table {

	public static void createTableUsers() throws FileNotFoundException, SQLException, ClassNotFoundException {

		// DATABASE CONNECTION

		Connection c = null;
		Statement stmt = null;

		try {

			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://mod-fund-databases.cs.bham.ac.uk/djh639", "djh639",
					"21jkmqarvr");

			stmt = c.createStatement();
			System.out.println("Creating table in given database...");

			//stmt.execute("DROP TABLE Users");
			
			String sql = "CREATE TABLE Users " + "(id serial UNIQUE primary key," + " user_name TEXT not NULL UNIQUE, " +
				 "password CHARACTER(6) not NULL," +  "level int not NULL)";
		

			// execute create tables
			stmt.executeUpdate(sql);
			
			System.out.println("Created table in given database...");
			System.out.println("Created ID in given database...");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.err.println("error");
			System.exit(0);
		}
		System.out.println("Opened");
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

		createTableUsers();
	}
}
