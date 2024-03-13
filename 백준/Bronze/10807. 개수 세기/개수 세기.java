import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    int N = scanner.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = scanner.nextInt();
    }
    int v = scanner.nextInt();

    for (int j = 0; j < arr.length; j++) {
      if (v == arr[j]) {
        count++;
      }
    }
      System.out.println(count);
  }
}