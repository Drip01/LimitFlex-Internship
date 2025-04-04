package internship.week2;

  class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
 public class AnimalHierarchy {
    public static void main (String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animal = new Animal();
        animal.sound();
        dog.sound();
        cat.sound();
        animal.sleep();
        dog.sleep();
        cat.sleep();
    }
}