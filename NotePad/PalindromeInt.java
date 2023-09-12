class PalindromeInt{
    public void intPalindrome(int x){
    String s = String.valueOf(x);
    int n = s.length();
    System.out.println(n); 
    for(int i = 0; i<n; i++){
        if(s.charAt(i) != s.charAt(n-i-1))
        
        System.out.println("Not Palindrome");
      
    }
    System.out.println("It is Palindrome");
   
    }
    public static void main(String []args){
        PalindromeInt pi = new PalindromeInt();
        pi.intPalindrome(1221);
    }
}