package week07;

import java.util.Scanner;

public class Q9095_boj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int[] arr = new int[11];

    arr[0] = 0;
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 4;

    int a = 0;

    for(int i = 0; i < num; i++){
      a = sc.nextInt();
      for(int j = 4; j <= a; j++){
        arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
      }
      System.out.println(arr[a]);
    }

  }
}