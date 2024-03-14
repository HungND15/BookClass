import Interface.LanguageBook;

public class EnglishBook extends AudioBook implements LanguageBook {
    @Override
    public void displayLanguage() {
        System.out.println("Language: English");
    }
}
