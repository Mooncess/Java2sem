package task1;

@FunctionalInterface
public interface CustomComparator <T> {
    int compare(T o1, T o2);
}