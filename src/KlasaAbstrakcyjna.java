public abstract class KlasaAbstrakcyjna {
    private int x;
    public String imie;

    public KlasaAbstrakcyjna(int x, String imie) {
        this.x = x;
        this.imie = imie;
    }

    public void cos() {
        System.out.println("cos");
    }

    abstract void metodaAbstrakcyjna();
}
