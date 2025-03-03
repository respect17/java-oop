class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating bones");
    }
}

class Cat extends Animal {

    @Override

    void eat() {
        System.out.println("The cat eats insects");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cat d = new Cat();
        d.eat();

    }
}