public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 0.5);
        basket.print("Milk");




        Arithmetic arithmetic = new Arithmetic(7, 9);
        System.out.println(arithmetic.Addition());
        System.out.println(arithmetic.Multiplication());
        System.out.println(arithmetic.Max());
        System.out.println(arithmetic.Min());
    }
}


