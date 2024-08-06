public class KlasaKolegi implements InterfejsKlasyKolegi {

    private int x;

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void cos() {
        System.out.println("cos");
    }
}
