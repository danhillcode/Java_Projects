
public class TestRecursion {
	
	static void printnums(int n) {
		if (n == 0) {
			System.out.print(0);
		} else {
			System.out.println(n);
			printnums(n - 1);
		}
	}

	public static void main(String[] args) {
		printnums(10);

	}

}
