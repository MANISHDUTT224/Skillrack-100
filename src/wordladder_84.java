import java.util.*;
class WordandLen{
    String word;
    int len;
    WordandLen(String word,int len){
        this.word=word;
        this.len=len;
    }
}
public class wordladder_84{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        Set<String>wordList=new HashSet<>();
         String startword=s.nextLine();
         String endword=s.nextLine();
        for(int i=0;i<n;i++){
            wordList.add(s.nextLine());
        }
       WordandLen w=new WordandLen(startword,1);
        Queue<WordandLen> q=new LinkedList<>();
        q.add(w);
        while(!q.isEmpty()){
            WordandLen currword=q.poll();
            String word=currword.word;
            int len=currword.len;
            char []wordarray=word.toCharArray();
            if(word.equals(endword)){
                System.out.println(len);
                return;
            }
            for(int i=0;i<word.length();i++){

                char currentchar=wordarray[i];

                for(char c='a';c<='z';c++){
                    wordarray[i]=c;
                   String neword=new String(wordarray);
                    if(wordList.contains(neword)){
                        wordList.remove(neword);
                        q.add(new WordandLen(neword,len+1));
                    }
                }
              wordarray[i]=currentchar;
            }
        }
        System.out.println(0);

    }
}
/*
Test Case 1:
6
hit
cog
hot
dog
dot
lot
log
cog
Output:
5
Test Case 2:
5
hit
cog
hot
dog
dot
lot
log
Output:
0
 */