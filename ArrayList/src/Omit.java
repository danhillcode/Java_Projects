
import java.util.ArrayList;
import java.util.Collections;


public class Omit {

public static ArrayList <Integer> allIntegersWithout(int from, int to, int omittedDigit){
 
int From = from;
int To = to;
int removed = omittedDigit;
 
ArrayList<Integer> values = new ArrayList<>();
 
Integer[] array = { 10, 20, 30 };
 
for (int i = From; i >= To; i++){
int number = From + 1;
values.get(number);
}
 
 
// Add all elements in array to ArrayList.
Collections.addAll(values, array);
 
 
 
 
//ArrayList <Integer> items = new ArrayList<Integer>(1);
 

 
 
//values.remove(0);
return values;
 
 
}
 
 
public static void main(String [ ] args){
System.out.println(allIntegersWithout(20,45,3));
}
 
 
 
 
}