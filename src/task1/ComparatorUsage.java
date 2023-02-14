package task1;

public class ComparatorUsage {
    public static void main(Integer[] a, Integer[] b) {

        //compare 2 arrays of integers by their length
        CustomComparator<Integer[]> lengthComparator = (o1, o2) -> {
            if (o1.length > o2.length) {
                return 1;
            } else if (o1.length < o2.length) {
                return -1;
            } else {
                return 0;
            }
        };

        System.out.println(lengthComparator.compare(a, b));
    }
}
