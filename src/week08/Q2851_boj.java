package week08;

import java.util.Scanner;

public class Q2851_boj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] mush = new int[10];
    int sum;		// 각각 버섯을 더했을 때 점수
    int result;		// 최종 점수
    int eat = 1;	// 버섯 개수
    int score1;
    int score2;

    for(int i=0; i<10; i++)
      mush[i] = sc.nextInt();

    result = mush[0];

    for(int i=0; i<10; i++) {
      sum = 0;
      if(eat == 10)	// 10개 먹으면 끝
        break;
      for(int j=0; j<=eat; j++)
        sum += mush[j];

      if(sum == 100) {
        result = sum;
        break;
      }

      // 절댓값 변환해서 비교
      score1 = Math.abs(100 - result);  // 이전에 계산한 점수
      score2 = Math.abs(100 - sum);   // 현재 게산된 점수

      if(score1 >= score2)  // 둘 중 근사한 값 비교
        result = sum;
      eat ++;
    }

    System.out.println(result);
  }
}