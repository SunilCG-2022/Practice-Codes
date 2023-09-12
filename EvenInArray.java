public class EvenInArray{
    
    public static void main(String[] args) {
        int a[] ={12,34,2,23,5,235,2,2,43,56,474,453656,64,61,67};
        

        for(int i=0;i<a.length;i++){
           if(a[i] % 2 == 0)
           System.out.println(a[i]+" is even.");
           else
           System.out.println(a[i]+" is odd.");
        }
    }
}