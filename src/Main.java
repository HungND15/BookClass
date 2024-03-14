public class Main {
    public static void main(String[] args) {
        NormalBook fiction1 = new NormalBook();
        fiction1.setTitle("Game of Throne");
        fiction1.setAuthor("Abc");
        fiction1.pageCount = 500;
        fiction1.displayInfo();

        JapaneseBook japan1 = new JapaneseBook();
        japan1.setTitle("Luyen nghe");
        japan1.setAuthor("Xyz");
        japan1.duration = 120;
        japan1.displayInfo();
        japan1.displayLanguage();
    }
}
