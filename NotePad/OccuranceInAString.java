public class OccuranceInAString {
    
    public int strStr(String hayStack,String needle){

        int hayStackLength = hayStack.length();
        int needleLength = needle.length();

        if(hayStackLength < needleLength){
            return -1;
        }
        for(int i=0;i<=hayStackLength-needleLength;i++){
            int j =0;
            while(j<needleLength && hayStack.charAt(i+j)==needle.charAt(j))
            j++;
            if(j == needleLength){
                return i;
            }
        }
    return -1;  
    }
}
