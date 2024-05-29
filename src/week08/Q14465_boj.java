package week08;

import java.io.*;
import java.util.*;


public class Q14465_boj {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int []arr= new int[100005]; // 신호등의 상태
    int n = Integer.parseInt(st.nextToken()); // 전체 신호등 수
    int k = Integer.parseInt(st.nextToken()); // 연속되야하는 신호등 수
    int b = Integer.parseInt(st.nextToken()); // 고장난 신호등 수

    for(int i=0;i<b;i++)
    {
      int a = Integer.parseInt(br.readLine());
      arr[a] = 1;
    }
    int cnt =0;

    for(int i=1;i<=k;i++)
    {
      if(arr[i] ==1)
        cnt++;
    }
    int m = cnt;

    for(int l=1;l+k-1<n;l++)
    {
      if(arr[l]== 1)
        cnt--;
      if(arr[l+k] == 1)
        cnt++;
      m = Math.min(m,cnt);
    }
    bw.write(Integer.toString(m));
    bw.flush();
  }
}
