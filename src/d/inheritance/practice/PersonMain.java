package d.inheritance.practice;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요. 저의 이름은 " + name + "입니다. " + age + "입니다.");
    }
}

class Student extends Person {
    int studentID;
    String major;

    public Student(String name, int age, int studentID, String major) {
        super(name, age);
        this.studentID = studentID;
        this.major = major;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("학번은 " + studentID + "이며, " + major + "전공입니다.");
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Student s = new Student("김씨", 25, 1234, "컴공");
        s.introduce();
    }
}
