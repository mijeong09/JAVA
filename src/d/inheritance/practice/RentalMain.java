package d.inheritance.practice;

class Vehicle {
    String model;
    int dailyRate;

    public Vehicle(String model, int dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public int calculateRentalCost(int days) {
        return dailyRate *= days;
    }
}

class Car extends Vehicle {
    boolean hasGPS;

    public Car(String model, int dailyRate, boolean hasGPS) {
        super(model, dailyRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public int calculateRentalCost(int days) {
        if(hasGPS) {
            dailyRate += 10000;
        }
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return "Car{" +
                "hasGPS=" + hasGPS +
                ", model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                '}';
    }
}

class Truck extends Vehicle {
    double capacity;

    public Truck(String model, int dailyRate, double capacity) {
        super(model, dailyRate);
        this.capacity = capacity;
    }

    @Override
    public int calculateRentalCost(int days) {
        dailyRate += capacity * 5000;
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                ", model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                '}';
    }
}

public class RentalMain {
    public static void main(String[] args) {
        Car car = new Car("소나타", 50000, true);
        Truck truck = new Truck("포터", 70000, 1.5);

        System.out.println(car);
        System.out.println("3일 대여료: " + car.calculateRentalCost(3) + "원");

        System.out.println(truck);
        System.out.println("5일 대여료: " + truck.calculateRentalCost(5) + "원");
    }
}
