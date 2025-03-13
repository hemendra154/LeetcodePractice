import java.util.LinkedList;
import java.util.Queue;

public class FloodFill733 {

    void print(){
        System.out.println(floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1,1,2));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr,sc});
        int originalColor = image[sr][sc];
        if(originalColor == color)
            return image;
        int row = image.length;
        int col = image[0].length;
        image[sr][sc] = color;

        int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] cordinate = queue.poll();
            int r = cordinate[0];
            int c = cordinate[1];

            for(int i = 0; i<direction.length;i++){
                int nextR = r + direction[i][0];
                int nextC = c + direction[i][1];
                if(nextR >= 0 && nextR<row && nextC >= 0 && nextC < col
                    && image[nextR][nextC] == originalColor){
                    image[nextR][nextC] = color;
                    queue.add(new int[]{nextR,nextC});
                }
            }
        }
        return image;
    }
}
