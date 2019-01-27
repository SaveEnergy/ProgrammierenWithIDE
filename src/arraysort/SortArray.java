package arraysort;

import java.util.Scanner;

public class SortArray {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Bitte geben Sie ein Zahlenfolge ein: ");
    String inputString = scanner.nextLine();

    String[] stringArray = inputString.split(" ");
    int[] intArray = new int[stringArray.length];

    for (int index = 0; index < intArray.length; index++) {
      intArray[index] = Integer.parseInt(stringArray[index]);
    }

    new SortArray().sort(intArray);

    System.out.println("Sollen die Zahlen aufsteigend oder absteigend sortiert werden?\n"
        + "aufsteigend[1]\n absteigend[2]");
    int inputNumber = scanner.nextInt();

    if (inputNumber == 1) {
      for (int number : intArray) {
        System.out.print(" " + number);
      }
    }
    if (inputNumber == 2) {
      for (int index = intArray.length - 1; index > 0; index--) {
        System.out.print(" " + intArray[index]);
      }
    }

  }

  private int[] intArray;

  public void sort(int[] array) {
    this.intArray = array;
    quickSort(0, intArray.length - 1);
  }

  public void quickSort(int low, int high) {

    int sortBy = intArray[low + (high - low) / 2];
    int lowIndex = low;
    int highIndex = high;

    while (lowIndex <= highIndex) {
      while (intArray[lowIndex] < sortBy) {
        lowIndex++;
      }
      while (intArray[highIndex] > sortBy) {
        highIndex--;
      }
      if (lowIndex <= highIndex) {
        int temp = intArray[lowIndex];
        intArray[lowIndex] = intArray[highIndex];
        intArray[highIndex] = temp;
        lowIndex++;
        highIndex--;
      }
    }

    if (low < highIndex) {
      quickSort(low, highIndex);
    }
    if (high > lowIndex) {
      quickSort(lowIndex, high);
    }

  }


}
