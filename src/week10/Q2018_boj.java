package week10;

import java.util.*;
public class Q2018_boj {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int total = 0;

    int start = 1;
    int end = 1;
    int sum = 1;

    while(start <= end){
      if(sum == N) total++;
      if(sum < N){
        end++;
        sum += end;
      }
      else if(sum >= N){
        sum -= start;
        start++;
      }
    }
    System.out.println(total);
  }
}