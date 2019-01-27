package calculator;

import java.util.Scanner;

public class CalculatorStateMachine {

  enum State {
    START,
    FIRSTOPERATORM,
    OPERATOR,
    SECONDOPERATOR,
    CALCULATION,
    END
  }

  private State state = State.START;

  void start() {

    Scanner input = new Scanner(System.in);
    double firstOperator = 0;
    char operator = '+';
    double secondOperator = 0;
    double result = 0;

    while (true) {
      switch (state) {
        case START:
          System.out.println("\n------------------\n   Hello there!\n------------------\n");
          state = State.FIRSTOPERATORM;
          break;
        case FIRSTOPERATORM:
          System.out.print("Bitte geben Sie den ersten Operanden ein: ");
          firstOperator = Double.parseDouble(input.next());
          state = State.OPERATOR;
          break;
        case OPERATOR:
          System.out.print("Bitte geben Sie den Operator (+, -, *, /) ein: ");
          operator = input.next().charAt(0);
          if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            state = State.SECONDOPERATOR;
            break;
          } else {
            state = State.OPERATOR;
            break;
          }
        case SECONDOPERATOR:
          System.out.print("Bitte geben Sie den zweiten Operanden ein: ");
          secondOperator = Double.parseDouble(input.next());
          state = State.CALCULATION;
          break;
        case CALCULATION:
          if (operator == '+') {
            result = new CalculatorMath(firstOperator, secondOperator).addition();
          }
          if (operator == '-') {
            result = new CalculatorMath(firstOperator, secondOperator).difference();
          }
          if (operator == '*') {
            result = new CalculatorMath(firstOperator, secondOperator).multiply();
          }
          if (operator == '/') {
            result = new CalculatorMath(firstOperator, secondOperator).division();
          }

          System.out.println(
              "Ihre Rechung " + firstOperator + " " + operator + " " + secondOperator + " ergibt: "
                  + result);
          state = State.END;
          break;
        case END:
          System.out.print("Soll mit diesem Ergebnis weiter gerechnet werden? [y/n] ");
          char carryOn = input.next().charAt(0);
          if (carryOn == 'y') {
            firstOperator = result;
            state = State.OPERATOR;
            break;
          }

          System.out.print("Wollen Sie eine neue Rechnung starten? [y/n] ");
          char restart = input.next().charAt(0);
          if (restart == 'y') {
            state = State.FIRSTOPERATORM;
            break;
          }

          input.close();
          System.out.println("Bis zum nächsten mal!");
          return;
      }

    }

  }
}
