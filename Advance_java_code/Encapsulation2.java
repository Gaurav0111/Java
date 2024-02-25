class Person {
    private String FirstName;
    private String LastName;
    private int age;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public String getLastName() {
        return LastName;
    }
  
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
  
public class Encapsulation2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Gaurav");
        person.setLastName("Garwal");
        person.setAge(22);

        System.out.println("Name: " + person.getFirstName() +" "+ person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}
