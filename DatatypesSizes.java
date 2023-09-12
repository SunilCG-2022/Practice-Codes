/**
 * DatatypesSizes
 */
public class DatatypesSizes {

    int a = 2147483647;
    int b = 130;
    byte c = 127; 
    short d;
    double e;
    long f;
    char g;
    float h;

    public  void increment() {
        int b = ++a;
        System.out.println(b);
        byte i = ++c;
        int j =  (byte)b;
        System.out.println(i);
        System.out.println(j);
     }
    public static void main(String[] args) { 
        DatatypesSizes dt = new DatatypesSizes();
        dt.increment();
    }
}