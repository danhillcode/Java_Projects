
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** Name created at etc
 * 
 */

/**This is the public class WebCrawler. 
 */
public class WebCrawler {
	
/**This is the collectUrl method which takes a urlString as a parameter and then the method writes
 * the input to a file in this case webcrawl.hmtl but this can be modified. It has an exception if
 * the urlString parameter cannot be accessed. 
 * @param urlString
 * @return ArrayList<String> list 
 */
	public static ArrayList<String> collectUrls(String urlString){
	
		ArrayList<String> list = new ArrayList <String>();
	        String s = "http://cs.bham.ac.uk/~mmk/teaching/java/test.html";
	        String readString;
	        try {
	            URL url = new URL(s);
	            BufferedReader in =
	                new BufferedReader(new
	                                   InputStreamReader(url.openStream()));	            
	            BufferedWriter out =
	                new BufferedWriter(new FileWriter("webcrawl.html"));
	            int counter = 0;
	            while ((readString = in.readLine()) != null) {
	            	list.add(readString);
	                counter++;
	            }
	            in.close();
	            out.close();
	        }
	        catch (IOException e) {
	            System.out.println("no access to URL: " + s);
	        }
	        
	        Pattern regex = Pattern.compile("http://www.cs.bham.ac.uk");
	        Matcher regexMatcher = regex.matcher(s);
	       
	        if (regexMatcher.find()) {
	            String ResultString = regexMatcher.group();
	            list.add(ResultString);
	        } 
	        
	       return list;
 }

/**This is the method regex which does not take any parameters as it calls the method collectUrls to 
 * provide the input. The output variable is then converted to a string with the toString() method. 
 * 
 * @return ArrayList<String> Urls
 */
 
	public static ArrayList<String> regex(){
		String output = collectUrls("http://cs.bham.ac.uk/~mmk/teaching/java/test.html").toString();
		ArrayList<String> Urls = new ArrayList <String>();

		/**Initialize variables start which is the start of the url and end which is the end of the url to be 
 * collected and a counter which will be used to act within the for loop.	
 */
		int start = 0;
		int end = 0;
		int counter = 2;

/**The start variable the is set to an integer which is the start of a http string identifying a url 
 * within the web page. The end gets the end of the url tag identified with a (>) bracket in html.
 */
		start = output.indexOf("\"http");
		end = output.indexOf(">", start);
/**The for loop contains an if statement which will break if the index of start or end cannot be found
 * in other words if a String url cannot be identified. If a new url is found it is added to the ArrayList Urls
 * At the end of the for loop the start is set to the end of the last loop through so that the next url
 * can be identified and the loop can run through the text successfully without repeating 
 * the same url add to the Url ArrayList. The list of Urls is returned.
 */
		for (int i = 0; i <= counter; i++ ){
			
			if ((start == -1) || (end == -1)){
				break;
		}
		String url = output.substring(start, end);
		Urls.add(url);
		counter = counter + 1;

		start = output.indexOf("\"http", end);
		end =  output.indexOf(">", start);
		counter += 1;
		}
		return Urls; 
	}
	
/**The main method is used to call the methods within the class.
 * @param args
 */
	 public static void main(String[] args){
	//System.out.println(collectUrls("http://cs.bham.ac.uk/~mmk/teaching/java/test.html"));
	 System.out.println(regex());
	 }
}
	
	
	
	  
	
	
	


