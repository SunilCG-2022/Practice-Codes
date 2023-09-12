package TryCatch;

public class TryCatchOverridingSecond extends TryCatchOverriding {
    public void method(){
        try {
            System.out.println("From try 2");
            int a = 1/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Caught exception in second try" +e);
        }  
    }
}
