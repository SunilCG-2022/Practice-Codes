public class StringOccurences {
    
    static String countWords(String str){

        String a[] = str.split(" ");
        String wordWeek = "week";
        String wordToday = "today";
        String wordIs = "is";
        int week = 0;
        int today = 0;
        int is = 0;

        for(int i = 0; i<a.length;i++){
            if(wordWeek.equals(a[i])){
              week++;
            }else if(wordToday.equals(a[i])){
               today++;
            }else if(wordIs.equals(a[i])){
                is++;
             }
        }

        return "week = "+week +", today = "+today + ", is = "+is;
        
    } 
    public static void main(String[] args) {
        System.out.println(countWords("today is 4th day of week today is wonderful day"));
    }
}
