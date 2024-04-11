package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866_boj {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    Deque<Integer> deque = new LinkedList<>();
    int TC = Integer.parseInt(br.readLine());

    for(int i=0;i<TC;i++){
      st = new StringTokenizer(br.readLine(), " ");
      switch (st.nextToken()) {
        case "push_back" :
          deque.addLast(Integer.parseInt(st.nextToken()));
          break;
        case "push_front" :
          deque.addFirst(Integer.parseInt(st.nextToken()));
          break;
        case "pop_front" :
          sb.append(deque.removeFirst()+"\n");
          break;
        case "pop_back" :
          sb.append(deque.removeLast()+"\n");
          break;
        case "size" :
          sb.append(deque.size()+"\n");
          break;
        case "empty" :
          if(deque.isEmpty()){
            sb.append("1"+"\n");
          }else{
            sb.append("0"+"\n");
          }
          break;
        case "front" :
          sb.append(deque.getFirst()+"\n");
          break;
        case "back" :
          sb.append(deque.getLast()+"\n");
          break;
      }
      System.out.println(sb);

    }
  }
}