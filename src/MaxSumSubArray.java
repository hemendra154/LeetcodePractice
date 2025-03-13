public class MaxSumSubArray {
    void maxSumSubArray(){
        int arr[] = {1,8,2,7,4,8,1,6,3,9,9,9,2,1,2,3,9,1,8,3,7,1};
        int size = arr.length;
        int i = 0,window = 7, j = window-1;
        int x= 0, y = 3;
        int maxSum = 0;
        for(int a = i;a<=j;a++){
            maxSum = arr[a] + maxSum;
        }
        int sum = maxSum;
        while(j<size-1){

            j = j+1;
             sum = (sum + arr[j]) - arr[i];
            i= i+1;

            if(sum>maxSum){
                maxSum = sum;
                x= i; y=j;
            }
        }
        System.out.println(maxSum + " "+ x + " "+ y);
    }
}
