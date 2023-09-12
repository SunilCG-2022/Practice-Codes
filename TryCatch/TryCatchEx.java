package TryCatch;

public class TryCatchEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        try {
            int c = b/a;
            System.out.println("ans" +c);
        }catch (ArithmeticException ae){
            System.out.println(ae);
         } catch (Exception e) {
           System.out.println(e);
        }
    }
}
