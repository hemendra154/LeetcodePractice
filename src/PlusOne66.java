public class PlusOne66 {
    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //Input: s = "Hello World"
    //Output: 5
    //Explanation: The last word is "World" with length 5.
    void print(){
        int[] digits = {9,9,9};
        //Arrays.stream(plusOne(digits)).forEach(System.out::println)
        plusOne(digits);
        System.out.println();
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        int size = digits.length;
        for(int i = size-1; i>=0 && carry != 0;i--){
            int sum = digits[i] + carry;
            if(sum>9){
                digits[i] = sum%10;
                carry = sum/10;
            }else{
                digits[i] = sum;
                carry = 0;
            }
        }
        if(carry > 0){
            int[] result = new int[size+1];
            result[0] = carry;
            for(int i = 0; i<size;i++){
                result[i+1] = digits[i];
            }
            return result;
        }

        return digits;
    }
}
