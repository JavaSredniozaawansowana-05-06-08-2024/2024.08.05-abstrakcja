public class Klasa implements Interfejs1, Interfejs2 {

    @Override
    public void i1() {

    }

    @Override
    public void i2() {

    }

    @Override
    public void x() {
        //???
        //???
        System.out.println("x");
    }

    @Override
    public void y() {
        Interfejs2.super.y();
    }
}
