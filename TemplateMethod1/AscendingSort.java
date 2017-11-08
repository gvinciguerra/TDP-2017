public class AscendingSort<T extends Comparable<T>> extends Sort<T> {
    int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
