public class ReversePair493 {
    void print(){
        int[] a = {1,3,2,3,1};
        System.out.println(reversePairs(a));
    }
    public int reversePairs(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                long a = (long) nums[i];
                long b = (long) nums[j] * 2;
                if(a > b){
                    result++;
                }
            }
        }


        return result;
    }
}
