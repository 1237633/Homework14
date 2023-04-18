public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");

    }

    @Override
    public void checkTrailer() {
        throw new IllegalArgumentException("Неприменимо к данному типу ТС!");
    }

    @Override
    public void checkEngine() {
        throw new IllegalArgumentException("Неприменимо к данному типу ТС!");
    }

    @Override
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println(" ");
    }
}
