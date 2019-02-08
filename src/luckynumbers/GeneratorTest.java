package luckynumbers;

import java.util.stream.Stream;

public class GeneratorTest {

  public static void main(String[] args) {
    System.out.println(new LottoFeldGenerator().createField());
    System.out.println();
    new LottoFeldGenerator().createFields(5)
        .values()
        .forEach();
  }

}
