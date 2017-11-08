import java.util.Random;

public abstract class Sort<T> {
    private Random random = new Random();

    abstract int compare(T o1, T o2);

    public Sort() {

    }

    public final T[] sort(T[] array) {
        T[] tmp = array.clone();
        quickSort(tmp, 0, tmp.length - 1);
        return tmp;
    }
    
    private void quickSort(T[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);
    }

    private int partition(T[] array, int left, int right) {
        T pivot = array[left + random.nextInt(right - left)]; 
        int i = left;
        int j = right;
        while (i <= j) {
            while (compare(array[i], pivot) < 0)
                i++;
            while (compare(array[j], pivot) > 0)
                j--;
            if (i <= j) {
                T tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
