public class AudioBook extends Book {
    int duration;

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + duration + " minutes");
    }
}
