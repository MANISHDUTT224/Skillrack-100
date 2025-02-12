package set3;

import java.util.*;

public class photoheight_64 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      String [] firstline=s.nextLine().split(",");
      int n=Integer.parseInt(firstline[0].trim());
      int k=Integer.parseInt(firstline[1].trim());
      String names="ABCDEFGHIKLMNOPQRSTUVWXYZ".substring(0,n);
      List<String>photos=new ArrayList<>();
      for(int i=0;i<k;i++){
          photos.add(s.nextLine().trim().replaceAll(",",""));
      }
      boolean missing=false;
      for(Character name:names.toCharArray()){
          Queue<Character>queue=new ArrayDeque<>();
          List<Character> visited=new ArrayList<>();
          int relnodes=0;
          queue.add(name);
          visited.add(name);
          while(!queue.isEmpty()) {
              Character student = queue.poll();
              for (String seq : photos) {
                  if (seq.contains(student.toString())) {
                      String succ = seq.substring(seq.indexOf(student));
                      for (Character succwords : succ.toCharArray()) {
                          if (!visited.contains(succwords)) {
                              visited.add(succwords);
                              queue.add(succwords);
                              relnodes++;
                          }
                      }
                  }
              }
          }
              queue.add(name);
              while (!queue.isEmpty()){
                  Character student=queue.poll();
                  for(String seq:photos){
                      if(seq.contains(student.toString())){
                          String prev=seq.substring(0,seq.indexOf(student));
                          for(Character prevwords:prev.toCharArray()){
                              if(!visited.contains(prevwords)){
                                  queue.add(prevwords);
                                  visited.add(prevwords);
                                  relnodes++;
                              }
                          }
                      }
                  }
              }
          if(relnodes!=n-1){
              System.out.print(name+" ");
              missing=true;
          }

      }
      if(!missing){
          System.out.println("N/A");
      }

    }
}
/*
Test Case 1:
8,3
D,C,E,F,G,H
C,A,E
D,C,B,E
Output:
A B
Test Case 2:
8,3
D,C,E,F,G,H
C,A,B,E
D,B
Output:
N/A
 */
