public class MaximumPointsYouCanObtainfromCards1423 {

    void print(){
        int[] nums = {9,7,7,9,7,7,9};
        System.out.println(maxScore(nums,7));
    }

    public int maxScore(int[] num, int k) {
        int size = num.length;
        int window = size - k;
        for(int i = 1; i<size; i++){
            num[i] = num[i] + num[i-1];
        }
        if(window==0){
            return num[size-1];
        }
        int score = 0;
        int left = 0, right =  window-1;
        while(right < size){
            int currScore = 0;
            if(left == 0){
                currScore = num[right];
            }else{
                currScore= num[right]- num[left-1];
            }
            score = Math.max(score, num[size-1]-currScore);
            left++;
            right++;
        }

        return score;
    }

}
