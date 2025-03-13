public class ShellSort {

    public void sort() {
        int[] array = {10, 15, 1, 9, 7, 23};
        int size = array.length;
        for (int gap = size / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < size; i++) {
                int j = i;
                while (j >= gap && array[j] < array[j - gap]) {
                    int temp = array[j];
                    array[j] = array[j - gap];
                    array[j - gap] = temp;
                    j = j - gap;
                }
            }

            for(int i = 0 ; i< size ; i++){
                System.out.print(array[i] + " ");
            }System.out.println("gap = " + gap + " ");
        }
        for(int i = 0 ; i< size ; i++){
            System.out.print(array[i] + " ");
        }

    }
}
