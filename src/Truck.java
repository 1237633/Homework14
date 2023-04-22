public class Truck extends MotorizedTransport {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        serviceWheels();
        checkEngine();
        checkTrailer();
        System.out.println("--------------------------------------------------");
    }


}
