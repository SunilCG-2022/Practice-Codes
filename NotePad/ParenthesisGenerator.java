import java.util.ArrayList;
import java.util.List;

public class ParenthesisGenerator {
    public static List<String> parenthesisGeneratorMethod(int n){
        List<String> result = new ArrayList<>(); 
        paranthesisGeneratorHelperMethod("",0,0,n,result);
        return result; 
    }
    private static void paranthesisGeneratorHelperMethod(String current,int openCount,int closeCount, int n,List<String>result){
        if(current.length() == n*2){
            result.add(current);
            return;
        }

        if(openCount < n){
            paranthesisGeneratorHelperMethod(current+"(",openCount+1,closeCount,n,result);
        }

        if(closeCount < openCount){
            paranthesisGeneratorHelperMethod(current+")",openCount,closeCount+1,n,result);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        List<String> combinations = parenthesisGeneratorMethod(n);
        for(String combination:combinations){
            System.out.println(combination);
        }
    }
}