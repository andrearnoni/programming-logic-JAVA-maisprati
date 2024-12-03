public class Desafio3 {
  public int[] gerarFibonacci(int n) {
    int[] sequencia = new int[n];
    if (n > 0) sequencia[0] = 0;
    if (n > 1) sequencia[1] = 1;
    for (int i = 2; i < n; i++) {
      sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
    }
    return sequencia;
  }
}
