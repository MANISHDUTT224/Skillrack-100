import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class wordbreak_56 {
   public static void wordbreak(List<String>wordList,String str,String output,int start){
       if(start==str.length()){
           System.out.println(output.trim());
           return;
       }
       for(int i=start;i<str.length();i++){
           String word=str.substring(start,i+1);
           if(wordList.contains(word)){
               wordbreak(wordList,str,output+word+" ",i+1);
           }
       }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String [] words=s.nextLine().split("\\s+");
        String str=s.nextLine();
        List<String> wordList= Arrays.asList(words);
        wordbreak(wordList,str,"",0);
    }
}
/*
Test Case 1:
hot box hotbox
hotboxhotbox
Output:
hot box hot box
hot box hotbox
hotbox hot box
hotbox hotbox
Test Case 2:
abc abcdef ghi ghijk
abcdefghijk
Output:
abcdef ghijk
Test Case 3:
t h i s th hi is thi his this
this
Output:
t h i s
t h is
t hi s
t his
th i s
th is
thi s
this
 */