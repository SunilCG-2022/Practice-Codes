import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayProgram {
    public static void main(String[] args){

        //For integer

        int[] array = {32,56,2,24,654,574,434,2,356,787,954,567,568};
        Arrays.sort(array);
        List<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            intArrayList.add(new Integer(array[i]));
        }
        System.out.println("Int Array List : "+intArrayList);
    

        //For string
        String[] stringArray = {"Sunil", "Ajay","Anil","Mukesh","Dharmraj"};
        Arrays.sort(stringArray);

        List<String> stringArrayList = Arrays.asList(stringArray);
        System.out.println("String Array List : "+stringArrayList);


        //Sorting and then reversing the String array
        String[] anotherStringArray = {"Manoj","Sunil", "Ajay","Anil","Mukesh","Dharmraj"};
        Arrays.sort(anotherStringArray,Collections.reverseOrder());
        List<String> revStringArrayList = Arrays.asList(anotherStringArray);
        System.out.println("Reversed : "+revStringArrayList);
    }
}
