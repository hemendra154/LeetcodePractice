import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces547 {

    public int findCircleNum(int[][] isConnected) {
        boolean[] isVisited = new boolean[isConnected.length];
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < isConnected.length ; i++){
            if(!isVisited[i]){
                queue.add(i);

                while(!queue.isEmpty()){
                    int city = queue.poll();
                    isVisited[city] = true;

                    for(int j = 0; j<isConnected.length;j++){
                        if(isConnected[city][j] == 1 && !isVisited[j]){
                            queue.add(j);
                            isVisited[j] = true;
                        }
                    }
                }
                count++;
            }
        }

        return count;
    }
}
