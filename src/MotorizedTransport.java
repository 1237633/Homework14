public abstract class MotorizedTransport extends WheeledTransport {
    public MotorizedTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
