public class Arithmetic {

    int a = 0;
    int b = 0;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int Addition() {return a + b;}
    public int Multiplication() {return a * b;}
    public int Max() {return a>b ? a:b;}
    public int Min() {return a<b ? a:b;}

}



