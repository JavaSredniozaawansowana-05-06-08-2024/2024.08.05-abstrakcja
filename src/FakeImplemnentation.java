public class FakeImplemnentation implements InterfejsKlasyKolegi {
    @Override
    public int getX() {
        return 10;
    }

    @Override
    public void setX(int x) {
        System.out.println("ustawia sie x");
    }

    @Override
    public void cos() {
        System.out.println("cos");
    }
}
