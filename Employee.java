
public class Employee {

   private String name;
   private final double salary= 30000;
    public Employee(String name) {
        this.name = name;
    }
    public Employee() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
     public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("sunil");
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}