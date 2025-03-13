public class FindHCF {
    void print(){
        int x = 8;
        int y = 14;
        System.out.println(findHCF(x,y));
    }

    public int findHCF(int x, int y) {
        if(y == 0)
            return x;

        return findHCF(y,x%y);
    }

}
