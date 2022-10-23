public class cinco {
        public static void main(String[] args) {
          int i, k;
          for (i = 1; i <= 100; i++) {
            System.out.print(i + " Java");
            if (i == 1) {
              System.out.println(" atrapalha muita gente");
              continue;
            }
            for (k = 1; k <= i; k++) {
              System.out.print(" atrapalham ");
            }
            System.out.println("muita gente");
          }
        }
      }