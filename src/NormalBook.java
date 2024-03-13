public class NormalBook extends Book {
    int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Normal Book: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
    }
}
