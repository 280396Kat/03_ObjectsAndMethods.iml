public class Arithmetic {

    int a = 0;
    int b = 0;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addition() {return a + b;}
    public int multiplication() {return a * b;}
    public int max() {return a>b ? a:b;}
    public int min() {return a<b ? a:b;}

}



