package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

  public static void main(String[] args) {

    List<String> words = Arrays.asList("Hallo",
        "Informatik-Kurs",
        "an",
        "der",
        "DHBW",
        "Lörrach");

    List<Integer> integers = words
        .stream()
        .map(String::length)
        .collect(Collectors.toList());

    List<String> wordsWithLength = words
        .stream()
        .map(word -> word + " (" + word.length() + ")")
        .collect(Collectors.toList());

    words.forEach(word -> System.out.println("Word: " + word));

    System.out.println();
    integers.forEach(integer -> System.out.println("Amount of Symbols: " + integer));

    System.out.println();
    wordsWithLength.forEach(System.out::println);


    String longestWord = words
        .stream()
        .reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2)
        .orElse(null);

    String shortestWord = words
        .stream()
        .reduce((s1, s2) -> s1.length() <= s2.length() ? s1 : s2)
        .orElse(null);

    System.out.println();
    System.out.println("Longest and shortest word:\n");
    System.out.println(longestWord);
    System.out.println(shortestWord);
  }

}
