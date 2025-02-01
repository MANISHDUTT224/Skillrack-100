import java.util.*;

public class photoheight_64 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String []firstline=s.nextLine().split(",");
        int n=Integer.parseInt(firstline[0].trim());
        int k=Integer.parseInt(firstline[1].trim());
        List<String>photos=new ArrayList<>();
        String names="ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0,n);
        for(int i=1;i<=k;i++){
            photos.add(s.nextLine().trim().replaceAll(",",""));
        }
        boolean missing=false;
        for(Character name:names.toCharArray()){
            int relcount=0;
            Queue<Character> queue=new ArrayDeque<>();
            List<Character>visited=new ArrayList<>();
            queue.add(name);
            visited.add(name);
            while(!queue.isEmpty()){
                Character student=queue.poll();
                for(String seq:photos){
                    if(seq.contains(student.toString())){
                        String succ=seq.substring(seq.indexOf(student));
                        for(Character succnames:succ.toCharArray()){
                            if(!visited.contains(succnames)) {
                                queue.add(succnames);
                                visited.add(succnames);
                                relcount++;
                            }
                        }
                    }
                }
            }
            queue.add(name);
            while(!queue.isEmpty()){
                Character student=queue.poll();
                for(String seq:photos){
                    if(seq.contains(student.toString())){
                        String pred=seq.substring(0,seq.indexOf(student));
                        for(Character prednames:pred.toCharArray()){
                            if(!visited.contains(prednames)) {
                                queue.add(prednames);
                                visited.add(prednames);
                                relcount++;
                            }
                        }
                    }
                }
            }
            if(relcount!=n-1){
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
