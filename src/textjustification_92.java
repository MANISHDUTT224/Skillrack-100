import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class textjustification_92 {
//    public static String getFinalword(int i,int j,int eachwordspace,int extraspace,String[]wordlist,int maxWidth){
//        String s="";
//        for(int k=i;k<j;k++){
//            s+=wordlist[k];
//            if(k==j-1){
//                continue;
//            }
//            for(int space=1;space<=eachwordspace;space++){
//                s+=" ";
//            }
//            if(extraspace>0){
//                s+=" ";
//                extraspace--;
//            }
//        }
//        while(s.length()<maxWidth){
//            s+=" ";
//        }
//        return s;
//    }

//            while(j<numOfwords && letterscount+wordlist[j].length()+wordspaces+1<=maxWidth){
//                letterscount+=wordlist[j].length();
//                wordspaces++;
//                j++;
//            }
//            int remslots=maxWidth-letterscount;
//            int eachwordspace=(wordspaces==0)?0:(remslots/wordspaces);
//            int extraspace=(wordspaces==0)?0:(remslots%wordspaces);
//            if(j==numOfwords){
//                eachwordspace=1;
//                extraspace=0;
//            }
//            result.add(getFinalword(i,j,eachwordspace,extraspace,wordlist,maxWidth));
//            i=j;
//        }
//        for(String word:result){
//            System.out.println(word);
//        }
//
//    }
    static int maxWidth;
    public static String getFinalword(int eachwordspace,int extraspace,int i,int j,String[]wordlist){
        String s="";
        for(int k=i;k<j;k++){
            s+=wordlist[k];
            if(k==j-1){
                continue;
            }

            for(int space=1;space<=eachwordspace;space++){
                s+=" ";
            }
            if(extraspace>0){
                s+=" ";
                extraspace--;
            }
        }
        while(s.length()<maxWidth){
            s+=" ";
        }
        return s;
    }
public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    int numOfwords=s.nextInt();
     maxWidth=s.nextInt();
    s.nextLine();
    String str=s.nextLine();
    String[]wordlist=str.split(" ");
    int i=0;
    List<String>result=new ArrayList<>();

    while(i<numOfwords){
        int j=i+1;
        int letterscount=wordlist[i].length();
        int spaces=0;
        while(j<numOfwords && wordlist[j].length()+letterscount+spaces+1<=maxWidth){
            letterscount+=wordlist[j].length();
            spaces++;
            j++;
        }
        int remslots=maxWidth-letterscount;
        int eachwordspace=(spaces==0)?0:remslots/spaces;
        int extraspace=(spaces==0)?0:remslots%spaces;
        if(j==numOfwords){
            eachwordspace=1;
            extraspace=0;
        }
        result.add(getFinalword(eachwordspace,extraspace,i,j,wordlist));
        i=j;
    }
    for(String word:result){
        System.out.println(word);
    }
}

}
/*
Test Case 1:
7 16
This is an example of text justification
Output:
This    is    an
example  of text
justification
Test Case 2:
6 16
What must be acknowledgement shall be
Output:
What   must   be
acknowledgement
shall be
20 20
Science is what we understand well enough to explain to a computer.Art is everything else we do
 */
