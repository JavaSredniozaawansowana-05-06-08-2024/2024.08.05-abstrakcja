public abstract class Algorytm {

    public void calculate() {
        loadData();
        step1();
        step2();
        step3();
        saveResult();
    }

    abstract void loadData();

    public void step1() {
        System.out.println("step 1");
    }

    public void step2() {
        System.out.println("step 2");
    }

    public void step3() {
        System.out.println("step 3");
    }

    abstract void saveResult();
}
