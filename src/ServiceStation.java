public interface ServiceStation{

    default void check() {
        System.out.println("Обслуживаем нечто");
        System.out.println();
    }

}
