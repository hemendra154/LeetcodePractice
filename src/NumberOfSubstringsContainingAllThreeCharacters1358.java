public class NumberOfSubstringsContainingAllThreeCharacters1358 {
    void print(){
        System.out.println(numberOfSubstrings("abcabc"));
    }

    public int numberOfSubstrings(String s) {

        int[] count = {-1,-1,-1};
        int subStringCount = 0;

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'a':
                    count[0] = i;
                    break;
                case 'b':
                    count[1] = i;
                    break;
                case 'c':
                    count[2] = i;
                    break;
            }

            if(count[0] > -1 && count[1] > -1 && count[2] > -1){
                subStringCount = subStringCount + Math.min(count[0],Math.min(count[1],count[2])) + 1;
            }
        }

        return subStringCount;
    }
}
