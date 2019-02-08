package luckynumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LottoFeldGenerator {


  public List<Integer> createField() {

    ArrayList<Integer> field = new ArrayList<>(6);

    new Random().ints(1, 50)
        .distinct()
        .limit(6)
        .sorted()
        .forEach(field::add);

    return field;

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
