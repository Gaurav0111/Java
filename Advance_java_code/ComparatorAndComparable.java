import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Charlie", 35));
        persons.add(new Person("Bob", 25));

        // Sorting using Comparable (natural ordering based on age)
        Collections.sort(persons);
        System.out.println("\n Sorted by age (Comparable): " + persons);

        // Sorting using Comparator (custom ordering based on name)
        Collections.sort(persons, new PersonComparator());
        System.out.println("\n Sorted by name (Comparator): " + persons);
    }
}
