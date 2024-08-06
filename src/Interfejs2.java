public interface Interfejs2 {
    void i2();
    void x();

    default void y() {
        System.out.println("y2");
    }
}
