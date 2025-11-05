package b.oop.practice;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
