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
  private int[] resultArray = {};
  private JoinType join;


  public int[] compare(int[] firstArray, int[] secondArray, JoinType join) {

    this.join = join;
    this.firstArray = firstArray;
    this.secondArray = secondArray;

    innerJoin();

    return resultArray;

  }

  private void innerJoin() {
    for (int first = 0; first < firstArray.length; first++) {
      for (int second = 0; second < secondArray.length; second++) {
        if (firstArray[first] == secondArray[second]) {
          Arrays.copyOf(resultArray, resultArray.length + 1);
          resultArray[resultArray.length - 1] = firstArray[first];
        }
      }
    }
  }

}
