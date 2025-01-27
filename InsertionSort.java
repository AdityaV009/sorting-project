public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int temp; 
        for(int i = 1; i < input.length; i++) {
            int j = i;
            while(j > 0 && input[j - 1] > input[j]) {
                temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
                j--; 
            }
        }
    }
}