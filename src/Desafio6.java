import java.util.Random;
import java.util.Scanner;

public class Desafio6 {
  private int numeroCorreto;

  public Desafio6() {
    Random random = new Random();
    this.numeroCorreto = random.nextInt(50) + 1;
  }

  public boolean verificarPalpite(int palpite) {
    return palpite == numeroCorreto;
  }

  public int getNumeroCorreto() {
    return numeroCorreto;
  }
}
