
class Ex1 {
	public static int power(int n, int p) throws Exception {
		if (n <= 0 || p <= 0) {

			throw new Exception("n and p should be non-negative" + " try again sucker");
		}
		return ((int) Math.pow(n, p));
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(power(-1,10));
	}
}