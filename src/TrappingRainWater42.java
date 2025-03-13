public class TrappingRainWater42 {

    void print(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }


    public int trap(int[] height) {
        int water = 0;
        int left = 0, right = height.length-1, leftMax = 0, rightMax = 0;

        while(left<right){
            int leftHeight = height[left];
            int rightHeight = height[right];

            if(leftHeight <= rightHeight){
                if(leftHeight > leftMax){
                    leftMax = leftHeight;
                }else {
                    water = water + (leftMax - leftHeight);
                }
                left++;
            }else{
                if(rightHeight > rightMax){
                    rightMax = rightHeight;
                }else{
                    water = water + (rightMax- rightHeight);
                }
                right--;
            }
        }
        return water;
    }
}
