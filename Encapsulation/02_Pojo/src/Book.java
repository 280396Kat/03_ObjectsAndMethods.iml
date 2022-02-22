public class Book {

    private final String nameBook;
    private final String author;
    private final int quantityPage;
    private final double numberISNB;


    public Book(String nameBook, String author, int quantityPage, double numberISNB) {
        this.nameBook = nameBook;
        this.author = author;
        this.quantityPage = quantityPage;
        this.numberISNB = numberISNB;
    }


    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }
    public int getQuantityPage() {
        return quantityPage;
    }
    public double getNumberISNB() {
        return numberISNB;
    }



}
