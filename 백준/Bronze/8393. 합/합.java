import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int num1 = scanner.nextInt();
    int sum = 0;

    for (int i = 0 ; i <= num1; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}