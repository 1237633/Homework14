public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Truck("Kamaz", 8),
                new Bicycle("Aist", 2),
                new Car("Audi", 4),
                new ElectricCar("Mercedes EQS", 4),
                new Boat("Abramovich 's yacht")
        };

        ServiceStation sto = new ServiceStation();

        for (Transport transport : transports) {
            sto.service(transport);
        }

    }
}
