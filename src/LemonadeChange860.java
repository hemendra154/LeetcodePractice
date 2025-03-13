import java.util.HashMap;
import java.util.Map;

public class LemonadeChange860 {

    void print() {
        //5,5,5,10,20

        int[] nums = {5,5,10,10,20};
        System.out.println(lemonadeChange(nums));

    }

    public boolean lemonadeChange(int[] bills) {

        Map<Integer, Integer> currentBalance = new HashMap<>();
        currentBalance.put(5, 0);
        currentBalance.put(10, 0);
        currentBalance.put(20, 0);
        for (int money : bills) {
            switch (money) {
                case 5:
                    currentBalance.put(5, currentBalance.get(5) + 1);
                    break;
                case 10:
                    if (currentBalance.get(5) >= 1) {
                        currentBalance.put(10, currentBalance.get(10) + 1);
                        currentBalance.put(5, currentBalance.get(5) - 1);
                    } else {
                        return false;
                    }
                    break;
                case 20:
                    if (currentBalance.get(10) >= 1 && currentBalance.get(5) >= 1) {
                        currentBalance.put(20, currentBalance.get(20) + 1);
                        currentBalance.put(10, currentBalance.get(10) - 1);
                        currentBalance.put(5, currentBalance.get(5) - 1);
                    } else if (currentBalance.get(5) >= 3) {
                        currentBalance.put(20, currentBalance.get(20) + 1);
                        currentBalance.put(5, currentBalance.get(5) - 3);
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }
}
