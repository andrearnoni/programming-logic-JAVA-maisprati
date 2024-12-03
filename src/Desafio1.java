import java.util.Scanner;

public class Desafio1 {
  public double calcular(double num1, double num2, char operador) {
    double resultado = 0;
    switch (operador) {
      case '+':
        resultado = num1 + num2;
        break;
      case '-':
        resultado = num1 - num2;
        break;
      case '*':
        resultado = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
          resultado = num1 / num2;
        } else {
          throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        break;
      default:
        throw new IllegalArgumentException("Operador inválido!");
    }
    return resultado;
  }
}
