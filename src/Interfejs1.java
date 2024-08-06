public interface Interfejs1 {
    void i1();
    void x();

    default void y() {
        System.out.println("y1");
    }
}
