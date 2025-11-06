package c.oop2;

public class Person {
    String name;
    int age;
    String address;

    // 오버로딩: 상황에 맞게 매개변수를 다르게 사용할 때
    // new Person();
    public Person() {
        this.name = "noname";
        this.age = 0;
    }

    // new Person("Kim", 10);
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // new Person("Lee", 20, "Seoul");
    public Person(String name, int age, String address) {
        // this.name = name;
        // this.age = age;
        // 위에 있는 Person 생성자를 호출해서 코드 중복을 줄임
        // 항상 첫줄에 위치해야함
        this(name, age);
        this.address = address;
    }
}
