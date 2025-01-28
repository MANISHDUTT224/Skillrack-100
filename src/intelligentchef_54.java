import java.util.*;

class FoodItem implements Comparable<FoodItem>{
    List<Integer> customers;
    String name;
    public int compareTo(FoodItem other){
        return this.customers.size()-other.customers.size();
    }
}
public class intelligentchef_54 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        ArrayList<Integer>remcustomers=new ArrayList<>();
        Map<String,FoodItem>foodItemMap=new HashMap<>();

        for(int i=1;i<=n;i++){
            remcustomers.add(i);
            String [] preferences=s.nextLine().split("\\s+");
            for(String pref:preferences){
                if(!foodItemMap.containsKey(pref)){
                     FoodItem fi=new FoodItem();
                fi.name=pref;
                fi.customers=new ArrayList<>();

                foodItemMap.put(pref,fi);
                }
                foodItemMap.get(pref).customers.add(i);
            }
        }
        int count=0;
        while(!remcustomers.isEmpty()){
            ArrayList<FoodItem> items=new ArrayList<>(foodItemMap.values());
            Collections.sort(items,Collections.reverseOrder());
            FoodItem mostpreferred=items.get(0);
            foodItemMap.remove(mostpreferred.name);
            remcustomers.removeAll(mostpreferred.customers);
            count++;
            for(String f: foodItemMap.keySet()){
                foodItemMap.get(f).customers.removeAll(mostpreferred.customers);
            }
        }

        System.out.println(count);

    }
}
/*
Test Case 1:
5
Poori Idli
Idli
Idli Poori
Poori Dosa
Dosa
Output:
2
Test Case 2:
5
Poori
Idli
Idli Poori
Poori Dosa
Dosa

Output:
3

 */