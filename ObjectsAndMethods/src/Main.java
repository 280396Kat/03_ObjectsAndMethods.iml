public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 0.5);
        basket.print("Milk");




        Arithmetic arithmetic = new Arithmetic(7, 9);
        System.out.println(arithmetic.addition());
        System.out.println(arithmetic.multiplication());
        System.out.println(arithmetic.max());
        System.out.println(arithmetic.min());



        Printer printer = new Printer();
        printer.append(" Текст документа ", " Имя докумета ", 69);
        printer.print();


    }
}


