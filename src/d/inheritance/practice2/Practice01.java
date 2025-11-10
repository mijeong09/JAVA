package d.inheritance.practice2;

class Animal {
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public void makeSound() {
        System.out.println("소리를 냄");
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("어흥");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("뿌우우");
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("끼끼");
    }

}

class Zoo {
    Animal[] animal = {
      new Lion("심바", 10),
      new Elephant("덤보", 10),
      new Monkey("조조", 10)
    };
    public void feedingTime(Animal animal) {
        System.out.print(animal.name + " : ");
        animal.makeSound();
    }
}

public class Practice01 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        for (Animal animal : zoo.animal) {
            zoo.feedingTime(animal);
        }
    }
}
