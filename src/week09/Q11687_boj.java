package week09;

import java.util.Scanner;

public class Q11687_boj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt(); // m 입력 받기

    if (m == 0) {
      System.out.println(0);
      return;
    }

    int left = 1;
    int right = 5 * m;
    int result = -1;

    while (left <= right) {
      int mid = (left + right) / 2;
      int zero = countZero(mid);

      if (zero >= m) {
        if (zero == m) {
          result = mid;
        }
        right = mid - 1; // 더 작은 값을 찾기 위해 범위를 줄임
      } else {
        left = mid + 1; // 더 큰 값을 찾기 위해 범위를 늘림
      }
    }

    if (result != -1) {
      System.out.println(result);
    } else {
      System.out.println(-1); // 찾는 값이 없으면 -1 출력
    }
  }

  private static int countZero(int number) {
    int count = 0;
    for (int i = 5; number / i > 0; i *= 5) {
      count += number / i;
    }
    return count;
  }
}
