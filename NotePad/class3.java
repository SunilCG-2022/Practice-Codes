/**
 * class3
 */
public class class3 {

    public static boolean function(int a[],int n, int z){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i != j && a[i]+a[j] == z){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={1,4,2,3};
        int n = a.length;
        int z = 0;

        if(function(a,n,z)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}