import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a, b;
    a = scanner.nextInt();
    b = scanner.nextInt();
    double result = (double) a / b;
    System.out.println(result);
  }
}
