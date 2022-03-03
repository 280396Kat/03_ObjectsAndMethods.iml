public class Basket {

    private static int count = 0;
    private String items = "";
    private  int totalPrice = 0;
    private int limit;
    private static double totalWeight = 0;
    private static int totalCost = 0;
    private static int totalBasketCount = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
public static int getTotalCost(){
        return totalCost;
}
public static int getTotalBasketCount(){
        return totalBasketCount;
}

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static void sumTotalCost(int price, int count){
        totalCost = totalCost + count * price;
    }
    public static void sumTotalBasketCount(int count){
        totalBasketCount = totalBasketCount + count;
    }
    public static int averageProductPrice(){
        return totalCost/totalBasketCount;
    }
    public static int averageCostBasket(){
        return totalCost/count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0);
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

    }
    public void add(String name, int price, int count, double weight) {
        sumTotalCost(price,count);
        sumTotalBasketCount(count);
        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб. - " + weight + " кг/л.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight;


    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }
    public double getTotalWeight() {
        return totalWeight;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
