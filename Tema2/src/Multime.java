public class Multime {
    private Integer[] date;
    private static int dim;
    private int n;

    public Multime(Integer[] date, int dim, int n) {
        this.date = date;
        this.dim = dim;
        this.n = n;
    }

    public Multime(int dim) {
        this.dim = 10;
    }

    public void adauga() {
        Multime.dim = dim+n;
    }

    public void afisare() {
        System.out.println(Multime.dim);
    }

}
