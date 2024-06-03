package week09;

import java.util.Arrays;
import java.util.Scanner;

public class Q1920_boj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr1[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }

    Arrays.sort(arr1);

    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      if (binarySearch(arr1, sc.nextInt()) >= 0) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }

  static int binarySearch(int[] arr, int key) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] > key) {
        right = mid - 1;
      } else if (arr[mid] < key) {
        left = mid + 1;
      } else {
        return mid;
      }
    }

    return -1;
  }
}