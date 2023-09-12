/**
 * Inter
 */
public class Inter {
    
   public static void Order(String s){
   System.out.println("string");
   }

   public static void Order(Object o){
    System.out.println("object");
   }
   
   

    public static void main(String[] args) {
        Order(null);
    }
}
