public class Exception1 {
    static void exceptionCheck() throws Exception{

        try{
            throw new Exception("Exception in check");
        }finally{
            System.out.println("executed check");
        }
    }
    public static void main(String[] args) {
        try{
            exceptionCheck();
        }catch(Exception e){
            System.out.println("Exception in main");
        }
        System.out.println("Done");
    }
}
