public class class1 {
    public static void main(String[] args) {
        int x=20,y=10,z=10;
        try{
            int ans =x/(y-z);
            System.out.println(ans);
        }catch(ArithmeticException e){
            System.out.println("d zero");
        }finally{
            System.out.println("final");
        }
    }
}
