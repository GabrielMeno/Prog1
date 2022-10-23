public class nove {
        public static void main(String[] args) {
          int i, sum = 0;
          int ar[];
          ar = new int[50];
          for (i = 0; i < 50; i++) {
            ar[i] = 1 + (int) (Math.random() * 100);
            sum += ar[i];
          }
          sum = sum / 50;
          for (i = 0; i < 50; i++) {
            if (ar[i] < sum) {
              System.out.print(ar[i] + " ");
            }
          }
          System.out.println("");
        }
      } 

