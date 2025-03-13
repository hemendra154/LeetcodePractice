import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges994 {

    void print(){
        System.out.println(orangesRotting(new int[][]{{2,1,1},{1,1,0}, {0,1,1}}));
    }

    public int orangesRotting(int[][] grid) {

        if(grid == null || grid.length == 0)
            return -1;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> rottenQueue = new LinkedList<>();
        int freshOrangeCount = 0;
        int minute = 0;

        for(int i = 0; i<rows;i++){
            for(int j = 0; j<cols;j++){
                if(grid[i][j] == 1)
                    freshOrangeCount++;
                if(grid[i][j] == 2){
                    rottenQueue.add(new int[]{i,j});
                }
            }
        }

        if(freshOrangeCount == 0)
            return 0;

        int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!rottenQueue.isEmpty()){
            boolean rotten = false;
            int length = rottenQueue.size();
            for(int j = 0; j<length; j++) {
                int[] cordinate = rottenQueue.poll();
                int row = cordinate[0];
                int col = cordinate[1];

                for (int i = 0; i < direction.length; i++) {
                    int nextRow = row + direction[i][0];
                    int nextCol = col + direction[i][1];

                    if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols && grid[nextRow][nextCol] == 1) {
                        rotten = true;
                        grid[nextRow][nextCol] = 2;
                        rottenQueue.add(new int[]{nextRow, nextCol});
                        freshOrangeCount--;
                    }
                }
            }

            if(rotten)
                minute++;
        }

        return freshOrangeCount == 0 ? minute : -1;
    }

}
