public class FinalString {
    public static void finalString (String s){
        
        StringBuilder sb =new StringBuilder();

        for(char c:s.toCharArray()){
            if(c == 'i'){
                sb = sb.reverse();
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

        
    }
    public static void main(String[] args) {
        String s = "print";
        finalString(s);

    }
}
