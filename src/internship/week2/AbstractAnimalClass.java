package internship.week2;

abstract class MyAbstractAnimalClass {
    public abstract void makeSound ();
    public void sleep() {
        System.out.println("Zzz");
    }
}


class Cow extends MyAbstractAnimalClass {
    @Override
    public void makeSound() {
        System.out.println("The Dog barks");
    }
}


class Goat extends MyAbstractAnimalClass {
    public void makeSound() {
        System.out.println("The Cat meow");
    }
}


public class AbstractAnimalClass {
    public static void main(String[] args) {
        Cow myDog = new Cow();
        Goat myCat = new Goat();
        myDog.makeSound();
        myDog.sleep();
        myCat.makeSound();
        myCat.sleep();
    }
}