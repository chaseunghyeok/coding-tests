import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int X = scanner.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = scanner.nextInt();
    }

    for (int j = 0; j < arr.length; j++) {
      if (X > arr[j]) {
        System.out.print(arr[j] + " ");
      }
    }
  }
}