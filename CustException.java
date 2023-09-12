class InvalidAge extends Exception{
    public InvalidAge(String message){
        super(message);
    }
}

public class CustException {
    public static void main(String[] args) throws InvalidAge {
        int age = 12;
        if(age < 18){

            throw new InvalidAge("You are younger.");
        }
        else{
            System.out.println("You can vote");
        }
    }
}
