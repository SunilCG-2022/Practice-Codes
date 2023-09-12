public class DupicateWords {
    public static void main(String[] args) {
        String mainString = "Big black bug bit a big black dog on his big black nose then dog bit the bug";
       //main string to lower case
        String lowerCase = mainString.toLowerCase();
       //lower case string to words array
        String words[] = lowerCase.split(" ");
        int count;
    
        System.out.println("Duplicate words are : ");

        //lopping for the words to be compared
        for (int i = 0; i<words.length; i++){
            count = 1;

            //2nd loop for the words that are going to be compared with 
            for( int j=i+1; j<words.length; j++){

                //if  words [i] is equal to word[j] then increase count 
               if(words[i].equals(words[j])){
                count++;
                words[j] = "0";
               }
            }
            //if the duplicate word is present then print it
        if(count > 1 && words[i] != "0")
            System.out.println(words[i]);
        }
    }
}
