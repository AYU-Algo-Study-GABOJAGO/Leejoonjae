package week09;

import java.util.Scanner;

public class Q1654_boj {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int K = in.nextInt();
    int N = in.nextInt();

    int[] arr = new int[K];

    long max = 0;

    long min = 0; // 탐색 길이 최솟값
    long mid = 0; // 중간 값

    // 해당 랜선의 길이가 최댓값 인지를 확인 후 max 갱신
    for (int i = 0; i < K; i++) {
      arr[i] = in.nextInt();
      if(max < arr[i]) { // 해당 랜선의 길이가 max 보다 크면 max 값에 넣어줌
        max = arr[i];
      }
    }

    // 반드시 max에서 +1 값이어야함
    max++;

    while (min < max) {

      // 중간 길이 구하기
      mid = (max + min) / 2;


      long count = 0;

      // 중간 값으로 잘라서 만들어 질수 있는 총 개수

      for (int i = 0; i < arr.length; i++) {
        count += (arr[i] / mid);
      }
      if(count < N) {
        max = mid;
      }
      else {
        min = mid + 1;
      }

    }

    // UpperBound 얻어진 값(min) -1이 최대 길이
    System.out.println(min - 1);
  }
}