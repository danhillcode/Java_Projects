import java.util.Arrays;
import java.util.stream.Stream;



public class Mappy {
	
	public static Stream<String> map() {
	String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};
	Stream<String> myStream = Arrays.stream(myArray);
	
	Stream<String> myNewStream = 
            myStream.map(s -> s.toLowerCase() + " Smith");
	
	
	
	return myNewStream;
	}
	
	
	public static Stream<String> filter(){
		String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};
		Stream<String> myStream = Arrays.stream(myArray);
		
		Arrays.stream(myArray)
	      .filter(s -> s.length() > 4)
	      .toArray(String[]::new);
		
		return myStream;
	}
	
	public static Stream<String> filter2(){
        String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};
        Stream<String> myStream = Arrays.stream(myArray)
                 .filter(s -> s.length() > 2);
        return myStream;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		filter2().forEach(p -> System.out.println(p));
		//map().forEach(p -> System.out.println(p));
		
		//wordToSignature(String[] args);
	}
}
