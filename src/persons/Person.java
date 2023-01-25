package persons;

public abstract class Person {
    private String name;
    private int age;
    private double weight;
    private  String specialist;

    public Person(String name, int age, double weight, String specialist) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.specialist = specialist;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "persons.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
