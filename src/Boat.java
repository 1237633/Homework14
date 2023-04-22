public class Boat implements Transport{
    private final String modelName;

    public Boat(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void check() {
        System.out.println("Как вы вообще затащили эту " + modelName + " в гараж?");
    }
}
