package hangman;

public class HangmanGame {

  private enum GameState {
    START,
    CONFIG,
    PLAY,
    END
  }

  private GameState state = GameState.START;
  private HangmanConfig config;

  public void startHangman() {
    while (true) {
      switch (state) {
        case START:
          HangmanConfig.greeting();
          state = GameState.CONFIG;
          break;
        case CONFIG:
          config = new HangmanConfigurator().initialInput();
          state = GameState.PLAY;
          break;
        case PLAY:
          config.run();
          state = GameState.END;
          return;
        default:
          System.out.println("Es ist ein Fehler aufgetreten!");
          return;
      }
    }
  }

}
