public class Power {

    void print(){
        System.out.println(myPow(2.0,-2));
    }

    public double myPow(double x, int n) {
        if(x == 0)
            return 0;
        if(n > 0){
            return pow(x, n) ;
        }
        return 1/pow(x,  -1 * n) ;
    }
    public double pow(double x, long n) {
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            return pow(x*x, n/2);
        }else{
            return x * pow(x, n-1);
        }
    }
}
