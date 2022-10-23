public class quatro {
    public static void main(String[] args) {
    int i;
    for (i = 1; i < 11; i++) {
      if (i == 1) {
        System.out.print(" " + i + " x 6 =  " + i * 6);
        System.out.print("\t");
        System.out.print(" " + i + " x 2 =  " + i * 2);
        System.out.println("");
      } else if (i <= 4) {
        System.out.print(" " + i + " x 6 = " + i * 6);
        System.out.print("\t");
        System.out.print(" " + i + " x 2 =  " + i * 2);
        System.out.println("");
      } else if (i == 10) {
        System.out.print(i + " x 6 = " + i * 6);
        System.out.print("\t");
        System.out.print(i + " x 2 = " + i * 2);
        System.out.println("");
      } else {
        System.out.print(" " + i + " x 6 = " + i * 6);
        System.out.print("\t");
        System.out.print(" " + i + " x 2 = " + i * 2);
        System.out.println("");
      }
      if (i == 1) {
      }

    }
  }
}