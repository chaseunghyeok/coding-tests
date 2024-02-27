import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int result1 = A * (B % 10);
    int result2 = A * ((B / 10) % 10);
    int result3 = A * (B / 100);
    int result4 = A * B ;

    System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);
  }
}
