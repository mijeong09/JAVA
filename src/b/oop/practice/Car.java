package b.oop.practice;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void accelerate () {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
    }

    public void printInfo() {
        System.out.println("모델" + model + "속도" + speed);
    }
}
