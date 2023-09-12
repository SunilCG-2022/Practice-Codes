import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String str = sc.nextLine();
        boolean isPalindrome = true;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("it is not a palindrome.");
                isPalindrome = false;
                break;
            }
            
        }
        if(isPalindrome){
            System.out.println("it is Palindrome");
        }
        sc.close();
    }
}
