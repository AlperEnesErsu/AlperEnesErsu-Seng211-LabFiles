public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(120);
        Engine e2 = new Engine(400);
        Engine e3 = new Engine(250);

        Car s1 = new Car("Honda", "Civic", 2022, e1, FuelType.GASOLINE);
        Car s2 = new Car("BMW", "320d", 2021, e2, FuelType.DIESEL);
        Car s3 = new Car("Tesla", "Model S", 2024, e3, FuelType.ELECTRIC);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
