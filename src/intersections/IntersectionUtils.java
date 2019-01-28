package intersections;

import java.util.Arrays;

public class IntersectionUtils {

  public enum JoinType {
    INNER,
    OUTER,
    FULL
  }

  private int[] firstArray;
  private int[] secondArray;
  private int[] resultArray = new int[1];

  public int[] compare(int[] firstArray, int[] secondArray, String joinType) {

    this.firstArray = firstArray;
    this.secondArray = secondArray;

    JoinType join = JoinType.valueOf(joinType);

    switch (join) {
      case INNER: return innerJoin();
      case OUTER: return outerJoin();
      case FULL: return fullJoin();
      default: return new int[1];
    }

  }

  private int[] innerJoin() {

    for (int first : firstArray) {
      for (int second : secondArray) {
        if (notInArray(resultArray, second) && first == second) {
          resultArray = extendArray(resultArray);
          resultArray[resultArray.length - 1] = second;
        }
      }
    }

    if (notInArray(firstArray, 0)) {
      return Arrays.copyOfRange(resultArray, 1, resultArray.length);
    }

    return resultArray;

  }

  private  int[] outerJoin() {

    for (int first : firstArray) {
      if (notInArray(resultArray, first) && notInArray(secondArray, first)) {
        resultArray = extendArray(resultArray);
        resultArray[resultArray.length - 1] = first;
      }
    }

    for (int second : secondArray) {
      if (notInArray(resultArray, second) && notInArray(firstArray, second)) {
        resultArray = extendArray(resultArray);
        resultArray[resultArray.length - 1] = second;
      }
    }

    if (notInArray(firstArray, 0) || notInArray(secondArray, 0)) {
      return resultArray;
    }

    return Arrays.copyOfRange(resultArray, 1, resultArray.length);

  }

  private int[] fullJoin() {

    for (int first : firstArray) {
      if (notInArray(resultArray, first)) {
        resultArray = extendArray(resultArray);
        resultArray[resultArray.length - 1] = first;
      }
    }

    for (int second : secondArray) {
      if (notInArray(resultArray, second)) {
        resultArray = extendArray(resultArray);
        resultArray[resultArray.length - 1] = second;
      }
    }

    if (notInArray(firstArray, 0) && notInArray(secondArray, 0)) {
      return Arrays.copyOfRange(resultArray, 1, resultArray.length);
    }

    return resultArray;
  }

  private boolean notInArray(int[] arrayOne, int value) {

    for (int one : arrayOne) {
       if (value == one) {
         return false;
       }
    }

    return true;

  }

  private int[] extendArray(int[] arrayExtend) {
    return Arrays.copyOf(arrayExtend, arrayExtend.length + 1);
  }

}
