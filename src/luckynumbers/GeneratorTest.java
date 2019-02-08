package luckynumbers;

public class GeneratorTest {

  public static void main(String[] args) {
    System.out.println(new LottoFeldGenerator().createField());

    System.out.println();
    new LottoFeldGenerator().createFields(8)
        .forEach((key, value) -> System.out.println("Feld " + key + ": " + value));
    
    System.out.println();
    new LottoFeldGenerator().createFieldsBackwards(8)
        .forEach((key, value) -> System.out.println("Feld " + key + ": " + value));

  }

}