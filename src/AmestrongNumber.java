public class AmestrongNumber {
    void print(){
        int x = 153;
        System.out.println(isArmstrong(x));
    }

    private boolean isArmstrong(int x) {
        int digits = 0;
        for(int i = x; i>0; i =i/10){
            digits++;
        }
        int sum = 0;
        for(int i = x; i>0; i =i/10){
            sum = (int) (sum + Math.pow(i%10,digits));
        }

        return x == sum;
    }
}
