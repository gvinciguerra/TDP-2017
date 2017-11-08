public class DescendingSort<T extends Comparable<T>> extends Sort<T> {
    int compare(T o1, T o2) {
        return o2.compareTo(o1);
    }
}
