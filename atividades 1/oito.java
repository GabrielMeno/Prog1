import java.util.Scanner;

public class oito {
    
  public static void main(String[] args) {
    int[] ar;
    ar = new int[10];
    int i;
    int maior = -2147483648, menor = 2147483647;
    Scanner rd = new Scanner(System.in);
    for (i = 0; i < 10; i++) {
      ar[i] = rd.nextInt();
      if (ar[i] > maior) {
        maior = ar[i];
      }
      if (ar[i] < menor) {
        menor = ar[i];
      }
    }
    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);
  }
}

