public class Desafio7 {
  public int contarPalavras(String frase) {
    String[] palavras = frase.trim().split("\\s+");
    return palavras.length;
  }
}
