import Interface.LanguageBook;

public class JapaneseBook extends AudioBook implements LanguageBook {

    @Override
    public void displayLanguage() {
        System.out.println("Language: Japanese");
    }
}
