package set3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Link{
    int source,dest,dist;
}
public class singlesourceshortestpath_63 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Link>Links=new ArrayList<>();

        int cities,n;
        cities=s.nextInt();
         n=s.nextInt();
         for(int i=0;i<n;i++){
             Link l=new Link();
             l.source=s.nextInt();
             l.dest=s.nextInt();
             l.dist=s.nextInt();
             Links.add(l);
         }
         boolean relaxed=true;
         Integer[] shortestdist=new Integer[n+1];
         shortestdist[1]=0;
         for(int i=1;i<n && relaxed;i++){
             relaxed=false;
             for(Link link:Links){
                 if(shortestdist[link.source]==null){
                     continue;
                 }
                 if(shortestdist[link.dest]==null||shortestdist[link.source]+link.dist<shortestdist[link.dest]){
                     shortestdist[link.dest]=shortestdist[link.source]+ link.dist;
                     relaxed=true;
                 }
             }
         }

         for(int i=2;i<n;i++){
             System.out.println(shortestdist[i]);
         }


    }
}
/*
Test Case 1:
6 7
1 2 20
1 6 5
6 5 2
5 4 3
4 3 2
5 2 10
3 2 2
Output:
14 12 10 7 5
Test Case 2:
5 7
1 2 10
2 3 50
3 5 10
4 5 60
1 5 100
1 4 30
4 3 20
Output:
10 50 30 60
 */