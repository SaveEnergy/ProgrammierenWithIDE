package genericsquicksort;

import java.util.Arrays;

public class GenericMain {

  public static void main(String[] args) {

    Integer[] intList = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    Double[] doubleList = { 16.0, 23.0, 14.5, 7.7, 21.21, 20.19, 6.5, 1.7};

    new GenericQuickSort<Integer>()
        .sort(intList);

    new GenericQuickSort<Double>()
        .sort(doubleList);

    Arrays.stream(intList).forEach(idx -> System.out.print(idx + " "));
    System.out.println();
    Arrays.stream(doubleList).forEach(idx -> System.out.print(idx + " "));

  }
}
