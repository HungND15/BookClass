public class AudioBook extends Book {
    int duration;

    @Override
    public void displayInfo() {
        System.out.println("Audio Book:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + duration + " minutes");
    }
}
