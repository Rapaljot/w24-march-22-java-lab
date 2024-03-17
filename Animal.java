// Base class
class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

// Subclasses
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("The lion roars ");
    }
}
class Birds extends Animal {
    @Override
    void sound() {
        System.out.println("The birds chirps ");
    }
}
class Frog extends Animal {
    @Override
    void sound() {
        System.out.println("The frog croaks ");
    }
}
class Dolphins extends Animal {
    @Override
    void sound() {
        System.out.println("The dolphins whistles ");
    }
}
class Bees extends Animal {
    @Override
    void sound() {
        System.out.println("The bees buzzes ");
    }
}
