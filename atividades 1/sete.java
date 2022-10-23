public class sete {
        public static void main(String[] args) {
          int primos = 0;
          int div;
          int i, j;
          System.out.println("Numeros primos entre 100-200: ");
          for (i = 100; i <= 200; i++) {
            div = 0;
            for (j = 1; j <= i; j++) {
              if (i % j == 0) {
                div++;
              }
            }
            if (div == 2) {
              primos++;
              System.out.print(i + " ");
            }
          }
        }
    }  

