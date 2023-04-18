public class Main {
    public static void main(String[] args) {
        Truck t1 = new Truck("Kamaz", 8);
        Bicycle b1 = new Bicycle("Aist", 2);
        Car c1 = new Car("Audi", 4);

        Transport[] transports = {t1, b1, c1};
        for (Transport transport : transports) {
            transport.check();
        }
    }
}