/**
 * SwapNums
 */
public class SwapNums {

    int a,b;
    public void swapWithoutThirdVariable(int a,int b) {
        b=b+a;
        System.out.println("first b : "+b);
        a=b-a;
        System.out.println("first a : "+a);
        b=b-a;
        System.out.println("first b : "+b);
        
        System.out.println("a is: " +a+", b is: "+b);
    }
    public static void main(String[] args) {
        

        SwapNums sn = new SwapNums();
        sn.swapWithoutThirdVariable(100, 20);
    }
}