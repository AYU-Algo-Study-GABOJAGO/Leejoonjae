package week09;

import java.util.*;

public class Q20444_boj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextInt();  // 가위질 횟수
    long k = sc.nextLong(); // 원하는 조각 수

    long lo = 0;
    long hi = n / 2; // 종이를 반으로 자르는 게 최대
    while(lo <= hi) {
      long row = (lo + hi) / 2; // 가로를 자르는 횟수
      long col = n - row; // 세로를 자르는 횟수

      long total = cut(row, col);
      if(total == k) {  // total이 K와 같다면 YES, 종료
        System.out.println("YES");
        return;
      } else if(total > k) {
        hi = row - 1;
      } else if (total < k){
        lo = row + 1;
      }
    }
    System.out.println("NO");
  }

  public static long cut(long row, long col) {  // 조각 수 계산
    return (row + 1) * (col + 1);
  }
}