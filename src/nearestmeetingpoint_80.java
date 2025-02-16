import java.util.*;

import java.util.*;

public class nearestmeetingpoint_80 {

    public static List<Integer> shortPath(List<List<Integer>> adj, int start, int n) {
        List<Integer> dist = new ArrayList<>(Collections.nCopies(n, Integer.MAX_VALUE));
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist.set(start, 0);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                if (dist.get(v) == Integer.MAX_VALUE) {
                    dist.set(v, dist.get(u) + 1);
                    q.add(v);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(sc.nextInt());
        }

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        if(c1==c2){
            System.out.println(-1);
            return;
        }



        for (int i = 0; i < n; i++) {

                adj.get(i).add(edges.get(i));

        }
 if(adj.get(c1).get(0)==-1 || adj.get(c2).get(0)==-1){
            System.out.println(-1);
            return;
        }
  if(adj.get(c1).get(0)==c2 || adj.get(c2).get(0)==c1){
      System.out.println(-1);
      return;
  }
        List<Integer> v1 = shortPath(adj, c1, n);
        List<Integer> v2 = shortPath(adj, c2, n);

        int mn = Integer.MAX_VALUE, node = -1;
        for (int i = 0; i < n; i++) {
            if (v1.get(i) == Integer.MAX_VALUE || v2.get(i) == Integer.MAX_VALUE) {
                continue;
            }
            if (v1.get(i) + v2.get(i) < mn) {
                mn = v1.get(i) + v2.get(i);
                node = i;
            }
        }
        System.out.println(node);
    }
}

/*
Test Case 1:
16
-1 15 1 0 1 6 12 4 4 4 11 10 13 0 13 11
0 14
Output:
-1
Test Case 2:
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
9 13
9
 */