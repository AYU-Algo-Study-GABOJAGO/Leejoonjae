package week08;

import java.util.*;

public class Q2167_boj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] arr1 = new int[n+1][m+1]; //인덱스를 1부터 시작, n+1,m+1 로 배열 생성
    int[][] arr2 = new int[n+1][m+1]; //0번 인덱스의 값은 0

    //행별로 합을 구해서 dp[][] 배열에 저장
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        arr1[i][j] = sc.nextInt();

        // 각 행 별로 부분합
        arr2[i][j] = arr1[i][j] + arr2[i][j-1];	//0번 인덱스로 인해 j-1을 해도 에러 X
      }
    }

    int k = sc.nextInt();
    int[] sum = new int[k];   // 결과값

    for (int t = 0; t < k; t++) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      for (int row = i; row <= x; row++) { //각 행 별로 원하는 부분합을 sum에 넣어줌
        sum[t] += arr2[row][y] - arr2[row][j-1];
      }

    }

    for (int i = 0; i < k; i++) {
      System.out.println(sum[i]);
    }

  }
}