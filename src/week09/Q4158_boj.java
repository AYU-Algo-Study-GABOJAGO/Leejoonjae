package week09;

import java.io.*;
import java.util.*;

public class Q4158_boj {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      if (n == 0 && m == 0) { // 둘다 0 0 입력하면 종료
        break;
      }

      int[] arr1 = new int[n]; // 상근 CD 번호 배열
      int[] arr2 = new int[m]; // 선영 CD 번호 배열

      for (int i = 0; i < n; i++) {
        arr1[i] = Integer.parseInt(br.readLine());
      }
      for (int i = 0; i < m; i++) {
        arr2[i] = Integer.parseInt(br.readLine());
      }

      int i = 0 ;
      int j = 0;
      int count = 0;

      while (i != n && j != m) {
        if (arr1[i] == arr2[j]) { // 같으면 count 증가
          count++;
          i++; // 다음 원소 비교위해 증가
          j++;
        }
        else if (arr1[i] > arr2[j]) {
          j++;
        } else {
          i++;
        }
      }
      System.out.println(count);
    }
  }
}