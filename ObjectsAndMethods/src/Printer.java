public class Printer {

    private String queue = " ";
    private int totalPagesCount = 0;
    private int pendingPages = 0;


    public void append(String text) {
        queue = queue + "\n" + text;
    }

    public void append(String text, int pageCount) {
        append(text);
        queue = queue + "   " + pageCount;
        pendingPages = pendingPages + pageCount;
    }

    public void append(String text, String title, int pageCount) {
        append(text, pageCount);
        queue = queue + "    " + title;
    }

    public void clear() {
        queue = "\n Текст Имя  Количество страниц. ";
        pendingPages = 0;
        System.out.println("Список пуст");
    }

    public void print() {
        System.out.println(queue);
        queue = " ";
        totalPagesCount = totalPagesCount + pendingPages;
        clear();

    }

    public int getPendingPagesCount() {
        return pendingPages;
    }

    public int getTotalPagesCount() {
        return totalPagesCount;
    }

}

