package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person{

    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
          
        List<Person> people = new ArrayList<>();
        people.add(new Person(46, "sunil"));
        people.add(new Person(32, "giri"));

        List <Person> above45 = people.stream().filter(person -> person.getAge() > 45).collect(Collectors.toList()); 
        above45.forEach(person -> System.out.println(person.getName()+ " - "+person.getAge()));
    }
}
