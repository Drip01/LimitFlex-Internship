package internship.week2;

public class Person {
    String name;
    int age;
    String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }
    public void setAddress(String address) {
        this.address = address;
    }
        public static void main(String[] args) {
            Person person = new Person("Drip", 22, "123 Ofo St");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            System.out.println("Address: " + person.getAddress());
            person.setName("Mawedo Zephyr");
            person.setAge(-1);
            person.setAddress("1 Sunny Iheogu St");

            System.out.println("\nUpdated info:");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress());


        }
    }

