package genericsquicksort;

class GenericQuickSort<T extends Comparable<T>> {

  private T[] values;

  public void sort(T[] values) {
    this.values = values;
    quickSort(0, values.length - 1);
  }

  private void quickSort(int low, int high) {

    T pivot = values[low + (high - low) / 2];
    int lowIndex = low;
    int highIndex = high;

    while (lowIndex <= highIndex) {
      while (values[lowIndex].compareTo(pivot) < 0) {
        lowIndex++;
      }
      while (values[highIndex].compareTo(pivot) > 0) {
        highIndex--;
      }
      if (lowIndex <= highIndex) {
        T temp = values[lowIndex];
        values[lowIndex] = values[highIndex];
        values[highIndex] = temp;
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
