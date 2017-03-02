
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	import org.rosuda.REngine.REXP;
	import org.rosuda.REngine.REXPMismatchException;
	import org.rosuda.REngine.Rserve.RConnection;
	import org.rosuda.REngine.Rserve.RserveException;

	public class HelloWorldR {

	    public static void main(String[] args) throws RserveException, REXPMismatchException, FileNotFoundException, IOException {
	        RConnection c = new RConnection("<host/ip>", 6311);
	        if(c.isConnected()) {
	            System.out.println("Connected to RServe.");
	            if(c.needLogin()) {
	                System.out.println("Providing Login");
	                c.login("username", "password");
	            }

	            REXP x;
	            System.out.println("Reading script...");
	            File file = new File("<file location>");
	            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	                for(String line; (line = br.readLine()) != null; ) {
	                    System.out.println(line);
	                    x = c.eval(line);         // evaluates line in R
	                    System.out.println(x);    // prints result
	                }
	            }

	        } else {
	            System.out.println("Rserve could not connect");
	        }

	        c.close();
	        System.out.println("Session Closed");
	    }

	}
