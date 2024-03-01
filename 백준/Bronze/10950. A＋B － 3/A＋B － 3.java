import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int num1 = scanner.nextInt();

    for (int i = 0 ; i < num1; i++) {
      int A = scanner.nextInt();
      int B = scanner.nextInt();
      System.out.println(A+B);
    }

  }
}