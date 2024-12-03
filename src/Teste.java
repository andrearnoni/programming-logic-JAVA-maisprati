import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1();
        Desafio2 desafio2 = new Desafio2();
        Desafio3 desafio3 = new Desafio3();
        Desafio4 desafio4 = new Desafio4();
        Desafio5 desafio5 = new Desafio5();
        Desafio6 desafio6 = new Desafio6();
        Desafio7 desafio7 = new Desafio7();

        System.out.println("Desafio 1: " + desafio1.calcular(10, 5, '+'));
        System.out.println("Desafio 2: " + desafio2.isPalindromo("arara"));
        System.out.println("Desafio 3: " + Arrays.toString(desafio3.gerarFibonacci(10)));
        System.out.println("Desafio 4: " + desafio4.inverterNumero(12345));
        System.out.println("Desafio 5: " + desafio5.isAnagrama("amor", "roma"));
        System.out.println("Desafio 6: " + desafio6.verificarPalpite(42));
        System.out.println("Desafio 7: " + desafio7.contarPalavras("Ola, mundo!"));
    }
}