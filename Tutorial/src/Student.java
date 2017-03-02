
public class Student implements  {

//this is overridden from the compareTo string method	
	@override
	public int compareTo(Student other){
		
		return  this.surname.compareTo( other.surname );		
		//compareTo of String -> interface
		
	}
	
}



1 > Not same //p > s  //because  p it comes before s in alphabet
0 same // smith = smith
-1 <  //