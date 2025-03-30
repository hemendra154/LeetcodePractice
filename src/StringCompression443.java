import java.util.Arrays;

public class StringCompression443 {

    void print() {
        int[] c = {1,0,1,1,1,1,1,1,0,1,1,1,1,1};
        System.out.println(longestSubarray1493(c));
    }

    public int compress(char[] chars) {

        int length = chars.length;
        if (length == 1)
            return 1;

        int i = 0;
        int start = 0;

        while (i < length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < length && chars[i] == currentChar) {
                count++;
                i++;
            }
            chars[start++] = currentChar;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[start++] = c;
                }
            }
        }

        return start;
    }

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;

        int count = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    public int longestSubarray1493(int[] nums) {

        int start = 0;
        int end = 0;
        int max = 0;
        int length = nums.length;
        boolean flag = true;

        while (end < length) {
            if (nums[end] == 1) {
                max = Math.max(max, end - start);
                end++;
            } else if (nums[end] == 0 && flag) {
                max = Math.max(max, end - start);
                flag = false;
                end++;
            }else {
                while(start<end){
                    if(nums[start++] == 0) {
                        break;
                    }
                }
                end++;
            }
        }

        if (max == length)
            return max - 1;
        return max;


    }
}
