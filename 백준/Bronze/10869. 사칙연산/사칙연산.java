import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a, b;
    a = scanner.nextInt();
    b = scanner.nextInt();
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    int div = a / b;
    int mod = a % b;
    System.out.println(add + "\n" + sub + "\n" + mul + "\n" + div + "\n" + mod);
  }
}
