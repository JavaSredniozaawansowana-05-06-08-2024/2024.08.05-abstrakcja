public class App2 {
    public static void main(String[] args) {
        Algorytm algorytm = new AlgorytmDB();
        algorytm.calculate();

        Algorytm fileAlgorytm = new FileAlgorytm();
        fileAlgorytm.calculate();
    }
}
