import java.util.Stack;

public class Brackets {
    public void func(String s){

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if( c == '(' || c == '{' || c == '['){
                st.push(c);
            }else if (st.empty()) System.out.println("false");

            else if (st.peek() == '(' && c == ')' && !st.isEmpty()){
                st.pop();
            }
            
            else if (st.peek() == '{' && c == '}' && !st.isEmpty()){
                st.pop();
            }

            else if (st.peek() == '[' && c == ']' && !st.isEmpty()){
                st.pop();
            }
            else System.out.println("false");
        }
        System.out.println("true");
    }
    public static void main(String[] args) {
        Brackets br = new Brackets();
        String s = "(}";
        br.func(s);
    }
}