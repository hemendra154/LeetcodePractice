public class LargestOddNumberInString1903{

    void print() {
        System.out.println(largestOddNumber("52"));
    }

    public String largestOddNumber(String num) {
        int i = num.length()-1;
        while(i > -1){
            if(Character.getNumericValue(num.charAt(i))%2 != 0)
                break;
            i--;
        }

        return num.substring(0,i+1);
    }
}
