public class MaximumScoreAfterSplittingaString1422 {

    void print(){
        System.out.println(maxScore("011101"));
    }

    public int maxScore(String s) {

        int[] temp = new int[s.length()];

        temp[0] = Character.getNumericValue(s.charAt(0));
        for(int i= 1; i<s.length();i++){
            temp[i] = Character.getNumericValue(s.charAt(i)) + temp[i-1];
        }
        int count = 0;
        int score = 0;

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '0'){
                count++;
            }

            score = Math.max(score, count + temp[s.length()-1] - temp[i]);
        }

        return score;

    }
}
