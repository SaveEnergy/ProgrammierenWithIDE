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
  private JoinType join;


  public int[] compare(int[] firstArray, int[] secondArray, JoinType join) {

    this.join = join;
    this.firstArray = firstArray;
    this.secondArray = secondArray;

    innerJoin();

    return resultArray;

  }

  private void innerJoin() {
    for (int first : firstArray) {
      for (int second : secondArray) {
        if (resultArray[resultArray.length - 1] != second && first == second) {
          resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
          resultArray[resultArray.length - 1] = first;
        }
      }
    }
  }

}
