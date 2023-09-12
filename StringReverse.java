import java.util.Scanner;

public class StringReverse {
    
    String reverseWords(String S){
        int low = S.length()-1;
        int high = S.length()-1;
      
        String res ="";

        while(high > 0 ){
            if(S.charAt(high) =='.'){
                res += S.substring(high+1, low+1)+".";
                high--;
                low = high;
            } else {
                high--;
            }
        }
        System.out.println(res+S.substring(high,low+1));
        return res+S.substring(high,low+1);
        
    }

    public static void main(String[] args) {
        
        StringReverse sr=new StringReverse(); 
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sr.reverseWords(S);

        sc.close();
    }
}
