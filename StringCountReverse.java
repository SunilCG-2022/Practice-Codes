public class StringCountReverse {
    public static String stringReverse(String s,int k){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            while(s.length() >= 2*k);
            String temp = s.substring(0, k);
            sb.append(new StringBuilder(temp).reverse());
            sb.append(s.substring(k,2*k));
            s = s.substring(k,2*k);
            System.out.println(s);
        }
        if(s.length() <= k){
            sb.append(new StringBuilder(s).reverse());
        }else {
            sb.append(new StringBuilder(s.substring(0, k)).reverse());
            sb.append(s.substring(k));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
      stringReverse(s, 2);
    }
    
}
