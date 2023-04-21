public class Main {
    public static void main(String[] args) {
        Truck t1 = new Truck("Kamaz", 8);
        Bicycle b1 = new Bicycle("Aist", 2);
        Car c1 = new Car("Audi", 4);

        t1.service();
        b1.service();
        c1.service();
    }
}
