public class Book {

    private String nameBook;
    private String author;
    private int quantityPage;
    private double price;


    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public Book(double price) {
        this.price = price;
    }
    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getQuantityPage() {
        return quantityPage;
    }

    public void setQuantityPage(int quantityPage) {
        this.quantityPage = quantityPage;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
