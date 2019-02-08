package luckynumbers;

public class GeneratorTest {

  public static void main(String[] args) {
    System.out.println(new LuckyFieldGenerator().createField());

    System.out.println();
    new LuckyFieldGenerator().createFields(3)
        .forEach((key, value) -> System.out.println("Feld " + key + ": " + value));

    System.out.println();
    new LuckyFieldGenerator().createFieldsBackwards(3)
        .forEach((key, value) -> System.out.println("Feld " + key + ": " + value));

  }

}