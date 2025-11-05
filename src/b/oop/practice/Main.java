package b.oop.practice;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 25);
        person1.printInfo();

        Dog dog1 = new Dog("진돗개", "백구");
        dog1.sit();
        dog1.hand();

        Car car = new Car("Avante", 0);
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.printInfo();

        BankAccount bankAccount = new BankAccount("123-123", 100000);
        bankAccount.deposit(1000000);

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.getCount();
    }
}
