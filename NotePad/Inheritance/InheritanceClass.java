package Inheritance;

public class InheritanceClass implements Inheritance1,Inheritance2{

    @Override
    public void doSomething() {
     System.out.println("do something method inherited");
    }

    public static void main(String[] args) {
        InheritanceClass ic =new InheritanceClass();
        ic.doSomething();
    }
    
}
