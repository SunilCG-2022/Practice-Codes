package TryCatch;

public class TryCatchOverridingThird extends TryCatchOverridingSecond{
    public void method(){
        try {
            System.out.println("From try 3");
            int a = 1/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Caught exception in 3 try" +e);
        }  
    }
    public static void main(String[] args) {
        TryCatchOverriding tc = new TryCatchOverridingThird();
        tc.method();
    }
}
