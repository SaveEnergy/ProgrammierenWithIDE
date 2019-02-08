package luckynumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LuckyFieldGenerator {

  private Stream<Integer> createIntStream(int amount) {
    return new Random()
        .ints(1, amount + 1)
        .distinct()
        .limit(6)
        .boxed();
  }


  public List<Integer> createField() {

    return createIntStream(49).sorted().collect(Collectors.toList());

  }

  public Map<Integer, List<Integer>> createFields(int number) {

    HashMap<Integer, List<Integer>> fields = new HashMap<>(number);

    for (int index = 1; index < number + 1; index++) {
      fields.put(index, createField());
    }

    return fields;

  }

  public Map<Integer, List<Integer>> createFieldsBackwards(int number) {

    Map<Integer, List<Integer>> reversedFields = createFields(number);

    for (List<Integer> values : reversedFields.values()) {
      Collections.reverse(values);
    }

    return reversedFields;

  }

}
