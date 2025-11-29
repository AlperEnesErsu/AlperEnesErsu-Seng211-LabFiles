enum FuelType { GASOLINE, DIESEL, ELECTRIC }

public class Car {
    String brand;
    String model;
    int year;
    Engine engine;
    FuelType fuelType;

    public Car(String b, String m, int y, Engine e, FuelType f) {
        brand = b;
        model = m;
        year = y;
        engine = e;
        fuelType = f;
    }

    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
        engine.showPower();
        switch (fuelType) {
            case GASOLINE -> System.out.println("Traditional engine.");
            case DIESEL -> System.out.println("Powerful but less eco-friendly.");
            case ELECTRIC -> System.out.println("Eco-friendly and quiet.");
        }
        System.out.println("----------------------");
    }
}

