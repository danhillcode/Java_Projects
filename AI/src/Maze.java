
/**
 * Class Maze - class for representing search space as a two-Locational maze
 */
public class Maze {
    public static short OBSTICLE = -1;
    public static short START_LOC_VALUE = -2;
    public static short GOAL_LOC_VALUE = -3;
    private int width = 0;
    private int height = 0;
    public Location startLoc = new Location();
    public Location goalLoc  = new Location();
    /**
     * The maze (or search space) data is stored as a short integer rather than
     * as a boolean so that bread-first style searches can use the array to store
     * search depth. A value of -1 indicates a barrier in the maze.
     */
    private short [][]maze;
    public Maze(int width, int height) {
        System.out.println("New maze of size " + width + " by " + height);
        this.width = width;
        this.height = height;
        maze = new short[width+2][height+2];
        for (int i=0; i<width+2; i++) {
            for (int j=0; j<height+2; j++) {
                maze[i][j] = 0;
            }
        }
        for (int i=0; i<height+2; i++) {
            maze[0][i] = maze[width+1][i] = OBSTICLE;
        }
        for (int i=0; i<width+2; i++) {
            maze[i][0] = maze[i][height+1] = OBSTICLE;
        }
        /**
         * Randomize the maze by putting up arbitray obsticals
         */
       /* 
        int max_obsticles = (width * height) / 3;
        for (int i=0; i<max_obsticles; i++) {
            int x = (int)(Math.random()*width);
            int y = (int)(Math.random()*height);
            setValue(x, y, OBSTICLE);
        }
        */
        /*
         * Creates the obstacles for the course
         */
        int firstBlockx = 2;
        int firstBlocky = 1;
        setValue(firstBlockx, firstBlocky, OBSTICLE);
        
        int firstBlockx1 = 2;
        int firstBlocky2 = 2;
        setValue(firstBlockx1, firstBlocky2, OBSTICLE);
        
        int secondBlockx = 2;
        int secondBlocky = 5;
        setValue(secondBlockx, secondBlocky, OBSTICLE);
        
        int secondBlockx1 = 3;
        int secondBlocky2 = 5;
        setValue(secondBlockx1, secondBlocky2, OBSTICLE);
        
        
        
        int thirdBlockx = 4;
        int thirdBlocky = 4;
        setValue(thirdBlockx, thirdBlocky, OBSTICLE);
        
        int thirdBlockx1 = 5;
        int thirdBlocky1 = 4;
        setValue(thirdBlockx1, thirdBlocky1, OBSTICLE);
        
        int thirdBlockx2 = 6;
        int thirdBlocky2 = 4;
        setValue(thirdBlockx2, thirdBlocky2, OBSTICLE);
        
        
        
        /**
         * Specify the starting location
         */
         startLoc.x = width - 8;
         //width - 8
         startLoc.y = height - 1;
       //height - 1
         setValue(width - 8, height - 1, (short)0);
         //width - 8, height - 1
         
        /**
         * Specify the goal location
         */
        goalLoc.x = 6;
        //6
        goalLoc.y = 1;
        //1
        setValue(6,1, GOAL_LOC_VALUE);
        
       //6,1
    }
    synchronized public short getValue(int x, int y) { return maze[x+1][y+1]; }
    synchronized public void setValue(int x, int y, short value) { maze[x+1][y+1] = value; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}