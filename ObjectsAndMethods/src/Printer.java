public class Printer {

    private String queue = " ";
    private static int countPages = 0;
    private int totalPages = 0;
    private int pendingPages = 0;


    public static int getCountPages() {
        return countPages;
    }

    public static void increaseCountPages(int countPages) {
        Printer.countPages = Printer.countPages + countPages;
    }

    public void append(String text) {
        append(text);
    }

    public void append(String text, int pages) {
        append(text, pages);
    }

    public void append(String text, String title, int pages) {
        queue = queue + "\n" + text + " . " + title + " . " + pages + " cтр. ";
        totalPages = totalPages + countPages * pages;
    }

    public void clear() {
        queue = "";
        totalPages = 0;
    }

    public void print() {
        System.out.println(queue);

    }

    public int getPendingPagesCount() {
        return pendingPages;

    }

    public int getTotalPagesCount() {
        return totalPages;
    }
}

