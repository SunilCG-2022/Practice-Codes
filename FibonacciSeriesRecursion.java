public class FibonacciSeriesRecursion {
   static int n1=0,n2=1,n3=0;

   public static void fibo(int count){

    if(count>0){
    n3 = n1 + n2; //1

    n1 = n2;      //1
    System.out.println("static n1: "+n1);
    n2 = n3;      //1
   System.out.println("static n2: "+n2);

    System.out.print(" "+n3);
    fibo(count - 1);
    }
   }

   public static void main(String[] args) {
    int count = 10;
    System.out.print(n1+" "+n2);
    fibo(count - 2);
   }

}
