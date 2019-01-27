package calculator;

public class CalculatorMath {

  private double firstOperator;
  private double secondOperator;

  CalculatorMath(double firstOperator, double secondOperator) {
    this.firstOperator = firstOperator;
    this.secondOperator = secondOperator;
  }

  double addition() {
    return firstOperator + secondOperator;
  }

  double difference() {
    return firstOperator - secondOperator;
  }

  double multiply() {
    return firstOperator * secondOperator;
  }

  double division() {
    return firstOperator / secondOperator;
  }


}
