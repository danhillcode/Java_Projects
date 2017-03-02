
public class TestRecursion3 {

	static int sum (int n) {
		   if (n == 0)
		      return 0;
		   else {
		      int y = sum (n-1);
		      System.out.println(n+y);
		      return n + y;
		   }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(3);
	}

}
