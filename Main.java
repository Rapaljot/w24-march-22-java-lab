public class Main {
    public static void main(String[] args) {
        // Array of Animal objects
        Animal[] animals = new Animal[12];

        // Populating the array with various animal instances
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Lion();
        animals[3] = new Birds();
        animals[4] = new Frog();
        animals[5] = new Dolphins();
        animals[6] = new Bees();
        // ... populate with other animal instances ...

        // Looping over the array and invoking sound method
        for (Animal animal : animals) {
            if (animal != null) {
                animal.sound(); // Polymorphism in action
            }
        }
    }
}
