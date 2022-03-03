public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add("Молоко", 40, 3, 0.5);
        basket.add("Огурец соленый", 100, 2, 1);
        basket.print("Корзина 1");




        Basket basket1 = new Basket();

        basket1.add("Дичь", 988,1, 1.2);
        basket1.add("Вино Бароло", 6700, 1, 0.75);
        basket1.print("Корзина 2");

        System.out.println("Количество корзин");
        System.out.println(Basket.getCount());
        System.out.println("Общая стоимость");
        System.out.println(Basket.getTotalCost());
        System.out.println("Общее количество товара");
        System.out.println(Basket.getTotalBasketCount());
        System.out.println("Средняя цена товара");
        System.out.println(Basket.averageProductPrice());
        System.out.println("Средняя соимость корзины");
        System.out.println(Basket.averageCostBasket());




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


