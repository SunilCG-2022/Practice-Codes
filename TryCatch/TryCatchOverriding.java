package TryCatch;

public class TryCatchOverriding {
   public void method(){
    try {
        System.out.println("From try 1");
       // int a = 1/0;
       // System.out.println(a);
    } catch (Exception e) {
        System.out.println("Caught exception in first try" +e);
    }
   }
}
