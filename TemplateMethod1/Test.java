import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Sort<Integer> sort1 = new AscendingSort();
        Sort<Integer> sort2 = new DescendingSort();
        Integer[] input = new Integer[] {1, 5, 3, 6, 0, 4, 2};
        Integer[] sorted1 = sort1.sort(input);
        Integer[] sorted2 = sort2.sort(input);
        System.out.println("Input array:\t" + Arrays.toString(input));
        System.out.println("Ascending:\t" + Arrays.toString(sorted1));
        System.out.println("Descending:\t" + Arrays.toString(sorted2));
    }
}
