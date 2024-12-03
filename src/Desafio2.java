public class Desafio2 {
  public boolean isPalindromo(String palavra) {
    String palavraLimpa = palavra.replaceAll("[\\W_]", "").toLowerCase();
    String reverso = new StringBuilder(palavraLimpa).reverse().toString();
    return palavraLimpa.equals(reverso);
  }
}
