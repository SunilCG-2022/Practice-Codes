public class Change {
    public static void main(String[] args) {
        Change c = new Change();
        c.calc();
    }

    void calc(){
        int [] a ={3,4,5};
        int [] b = change(a);

       System.out.println(a[0]+a[1]+a[2]+ " ");
       System.out.println(b[0]+b[1]+b[2]+ " ");
    }

    int[] change(int[] arr){
        arr[1] = 7;
        return arr;

    }
}
