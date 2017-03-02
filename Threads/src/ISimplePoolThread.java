

/*
 *   @author Behzad_Bordbar & Yi_Chen
 */



public interface ISimplePoolThread extends Runnable {
	/**
	 *   Use an infinite loop to retrieve and perform tasks.
	 */
    @Override
    public void run();
}
