import java.util.*;

public class integersoccuringoddtimes_89 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry: mp.entrySet()){
            if(entry.getValue()%2!=0){
                res.add(entry.getKey());
            }
        }
        Collections.sort(res);
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}
/*
Test Case 1:
5
1 2 3 4 5
Output:
1 2 3 4 5
Test Case 2:
9
10 10 20 20 30 30 40 50 50
Output:
40
Test Case 3:
13
4 3 3 9 4 9 1 7 7 7 1 2 2
Output:
7
 */