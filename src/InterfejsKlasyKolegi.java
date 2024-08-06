public interface InterfejsKlasyKolegi {
    int getX();
    void setX(int x);
    void cos();
    default void metoda() {
        cos1();
        cos2();
        cos3();
    }

    private void cos1() {
        // ???
        // ???
        // ???
        // ???
        System.out.println("cos 1");
    }

    private void cos2() {
        // ???
        // ???
        // ???
        // ???
        // ???
        System.out.println("cos 2");
    }

    private void cos3() {
        // ???
        // ???
        // ???
        // ???
        // ???
        System.out.println("metoda domyslna !!!");
    }
}
