package week08;

import java.util.Scanner;

public class Q11659_boj {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 배열의 크기
    int m = sc.nextInt();
    int[] arr = new int[n + 1];

    for (int i = 0; i < n; i++) {
      arr[i + 1] = arr[i] + sc.nextInt(); // 부분합
    }

    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(arr[b] - arr[a - 1]);
    }
  }
}