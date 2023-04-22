public abstract class MotorizedTransport extends WheeledTransport {
    public MotorizedTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        serviceWheels();
        checkEngine();
        System.out.println("--------------------------------------------------");
    }
}
