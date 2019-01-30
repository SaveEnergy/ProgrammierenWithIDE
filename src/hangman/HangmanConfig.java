package hangman;

import java.util.Scanner;

public class HangmanConfig {

  private final char[] word;
  private final int tries;

  private char[] guessedWord;

  public HangmanConfig(char[] word, int tries) {
    this.word = word;
    this.tries = tries;

    guessedWord = new char[word.length];
    for (int i = 0; i < guessedWord.length; i++) {
      guessedWord[i] = '_';
    }
  }

  public static void greeting() {
    System.out.println("############################################");
    System.out.println("#          Willkommen bei Hangman          #");
    System.out.println("############################################\n\n");
  }

  public void run() {

    for (char value: guessedWord) {
      System.out.print(value + " ");
    }

    System.out.println("\n\nVerbleibende Leben: " + tries);

    Scanner console = new Scanner(System.in);
    System.out.print("\nSpeiler 2: Gibt einen Buchstaben ein: ");
    char guess = console.next().charAt(0);

    compareTo(word, guess);

  }

  private void compareTo(char[] word, char guess) {

    for (int index = 0; index < word.length; index++) {
      if (word[index] == guess) {
        guessedWord[index] = word[index];
      }
    }

  }



}
