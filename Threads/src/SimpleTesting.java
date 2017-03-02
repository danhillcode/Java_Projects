
class SimpleTesting implements ISimpleTask{
    private int i;
    public SimpleTesting(int i){
        this.i = i;
    }
    @Override
    public void run() {
    	Long thisThread = Thread.currentThread().getId();
        System.out.println("The thread is: " + thisThread + " and the loop number is " + i);
    }
    
    public static void main(String args[]){
        // Initialize thread pool
        SimpleThreadPool pool = new SimpleThreadPool();
//        SimpleTask task = new SimpleTask();
        pool.start();
        // Create 20 tasks
        for(int i = 1; i<=2; i++){
            pool.addTask(new SimpleTesting(i));
            
            try {
    			Thread.sleep(1000);
    			System.out.println("Wake up thread");
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            
        }
        
        pool.stop();
        
       
    }
}