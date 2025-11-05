package b.oop.practice;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void sit() {
        System.out.println(name + breed + "가 앉았습니다.");
    }

    public void hand() {
        System.out.println(name + breed + "가 손을 내밀었습니다.");
    }
}
