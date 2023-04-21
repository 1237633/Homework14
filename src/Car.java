public class Car extends MotorizedTransport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        ServiceStation.check(this);
    }
}

