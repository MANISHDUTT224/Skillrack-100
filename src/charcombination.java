public class charcombination {
    public static void main(String[] args) {
        String str="abcd";
        int len=str.length();
        for(int ctr=1;ctr<(1<<len);ctr++){
            for(int shift=0;shift<len;shift++){
                if((ctr&(1<<shift))!=0){
                    System.out.print(str.charAt(shift));
                }
            }
            System.out.println();
        }
    }
}
