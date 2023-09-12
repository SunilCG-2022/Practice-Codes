import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DogsClass {
    private int id;
    private String name;
    private String breed;

    public DogsClass(){}

    public DogsClass(int id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        List<DogsClass> dogs = new ArrayList<DogsClass>();

        dogs.add(new DogsClass(1,"Buddy","Rotweiler"));
        dogs.add(new DogsClass(2,"Coco","Dalmatian"));
        dogs.add(new DogsClass(3,"Toby","Golden Retreaver"));
        dogs.add(new DogsClass(4,"Tom","Rotweiler"));
        dogs.add(new DogsClass(5,"Spike","Bull dog"));

        List<DogsClass> dogSorted = dogs.stream().filter(
            dogsClass -> dogsClass.getName().equalsIgnoreCase(
                "spike")).collect(Collectors.toList());

        dogSorted.forEach(dogsClass -> System.out.println(
            "Id: "+dogsClass.getId()+" , Name: "+dogsClass.getName()+" , Breed: "+dogsClass.getBreed()));
    }
}
