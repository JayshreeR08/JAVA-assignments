//Using Interface (Multiple Behavior)
// Interface 1
interface Animal {
    void eat();  // abstract method
}

// Interface 2
interface Pet {
    void play();
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.play();
    }
}
