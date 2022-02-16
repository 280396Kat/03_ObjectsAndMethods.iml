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
        printer.append("Текст", "Книга", 55);
        printer.append("Текст 1", "Фауст", 590);
        System.out.println("Количество страниц для печати: " + printer.getPendingPagesCount());
        System.out.println("Количество распечатанных страниц: " + printer.getTotalPagesCount());
        printer.print();
        System.out.println("Количество распечатанных страниц: " + printer.getTotalPagesCount());
        System.out.println("Количество страниц для печати: " + printer.getPendingPagesCount());
        printer.append("Текст 2", "Превращение", 156);
        printer.append("Текст 3","Жустина", 376);
        printer.clear();
        System.out.println("Количество страниц для печати: " + printer.getPendingPagesCount());
        System.out.println("Количество распечатанных страниц: " + printer.getTotalPagesCount());



    }
}


