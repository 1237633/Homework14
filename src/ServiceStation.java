public interface ServiceStation{

    default void check() {
        System.out.println("Обслуживаем нечто");
        System.out.println();
    }

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
