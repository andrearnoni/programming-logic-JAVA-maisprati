import java.util.Arrays;

public class Desafio5 {
  public boolean isAnagrama(String palavra1, String palavra2) {
    char[] arr1 = palavra1.replaceAll("\\s", "").toLowerCase().toCharArray();
    char[] arr2 = palavra2.replaceAll("\\s", "").toLowerCase().toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
  }
}
