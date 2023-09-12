import java.util.HashMap;
import java.util.Map;

class TwoSums{
    public int[] method(int[] num,int target){
        Map<Integer,Integer> collect = new HashMap<>();
        for(int i=0;i<num.length;i++){
            int comp = target - num[i];
            
            if(collect.containsKey(comp)){
                return new int[]{collect.get(comp),i};
            }
            collect.put(num[i],i); 
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        TwoSums ts = new TwoSums();
        int[] array = {2,5,11,15};
        ts.method(array, 9);
    }
   
}