package set3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Item implements Comparable<Item>{
    int costprice,profit;
    public int compareTo(Item other){
        return this.costprice-other.costprice;
    }
}

public class maximumvendorprofit_55 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int mat[][]=new int[k+1][n+1];
        List<Item> items=new ArrayList<>();
        items.add(new Item());
        for(int i=1;i<=k;i++){
            Item it=new Item();
            it.costprice=s.nextInt();
            it.profit=s.nextInt();
            items.add(it);
        }
      for(int item=1;item<=k;item++){
          if(items.get(item).costprice>n){
              System.out.println(mat[item-1][n]);
              return;
          }
          for(int amt=1;amt<=n;amt++){
              if(items.get(item).costprice>amt){
                  mat[item][amt]=mat[item-1][amt];
              }
              else{
                  int incprofit=items.get(item).profit+mat[item-1][amt-items.get(item).costprice];
                   int excprofit=mat[item-1][amt];
                  mat[item][amt]=Math.max(incprofit,excprofit);
              }
          }
      }

        System.out.println(mat[k][n]);
    }
}
/*
Test Case 1:
20 6
5 2
6 4
3 2
4 3
1 2
15 20
Output:
25

 */