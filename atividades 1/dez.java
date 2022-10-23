import java.util.Scanner;

public class dez {
  public static void main(String[] args) {
    int m[][] = new int[4][4];
    Scanner rd = new Scanner(System.in);
    int i, j, sum = 0;
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        m[i][j] = rd.nextInt();
        if (j < i) {
          sum += m[i][j];
        }
      }
    }
    System.out.println(sum);

  }
}

