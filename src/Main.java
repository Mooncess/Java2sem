import task1.ComparatorUsage;
import task2.Human;
import task2.Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


    }

    public static void Task1() {
        //Task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first array:");
        int length1 = scanner.nextInt();
        System.out.println("Enter the length of the second array:");
        int length2 = scanner.nextInt();
        Integer[] a = new Integer[length1];
        Integer[] b = new Integer[length2];
//        for (int i = 0; i < length1; i++) {
//            a[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < length2; i++) {
//            b[i] = scanner.nextInt();
//        }
        ComparatorUsage.main(a, b);
    }


}