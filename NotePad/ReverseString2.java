class ReverseString2{
public static void main(String [] args){
String s1 = "sunilgiri";
String empty = "";
char ch;
for(int i=0;i<s1.length();i++){
ch = s1.charAt(i);
empty = ch+empty;
}
System.out.println(empty);
 }
}