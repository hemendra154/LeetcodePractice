public class AddBinary67 {
    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //Input: s = "Hello World"
    //Output: 5
    //Explanation: The last word is "World" with length 5.
    void print(){
        String s1 = "101010010101011";
        String s2 = "1001111111010";

        System.out.println(addBinary(s1,s2));
    }

    public String addBinary(String a, String b) {
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        int l1 = c1.length, l2 = c2.length;
        int i = l1-1, j = l2-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i>=0 && j>=0){
                if(c1[i] == '1' && c2[j]== '1'){
                    if(carry == 1){
                        sb.append("1");
                    }else
                        sb.append("0");
                    carry = 1;
                }else if(carry == 1 && (c1[i] == '1' || c2[j]== '1')){
                    sb.append("0");
                    carry = 1;
                }
                else{
                    int sum = Character.getNumericValue(c1[i]) + Character.getNumericValue(c2[j]) + carry;
                    carry = 0;
                    sb.append(sum);
                }
                i--;j--;
        }
        while(i>=0){
            if(carry == 1 && c1[i] == '1'){
                sb.append("0");
                carry = 1;
            }
            else{
                int sum = Character.getNumericValue(c1[i]) + carry;
                carry = 0;
                sb.append(sum);
            }
            i--;
        }
        while(j>=0){
            if(carry == 1 && c2[j]== '1'){
                sb.append("0");
                carry = 1;
            }
            else{
                int sum = Character.getNumericValue(c2[j]) + carry;
                carry = 0;
                sb.append(sum);
            }
            j--;
        }
        if(carry == 1)
            sb.append(1);
        return sb.reverse().toString();
    }
}
