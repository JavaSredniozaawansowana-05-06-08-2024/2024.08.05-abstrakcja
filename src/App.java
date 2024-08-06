public class App {
    public static void main(String[] args) {
        InterfejsKlasyKolegi k = new KlasaKolegi();
        k.setX(5);
        System.out.println(k.getX());
        k.cos();
        k.metoda();
        /*k.cos1();
        k.cos2();
        k.cos3();*/

        System.out.println(Constants.HOST_PROPERTY);
    }
}
