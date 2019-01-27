package intersections;

import intersections.IntersectionUtils.JoinType;

public class IntersectionUtilsMain {

  public static void main(String[] args) {
    int array1[] = {1, 2, 3, 3, 4, 5};
    int array2[] = {3, 5, 6};


      for (int value : new IntersectionUtils().compare(array1, array2, JoinType.INNER)) {
        System.out.println(value);
      }


  }
}
