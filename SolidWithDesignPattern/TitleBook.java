package SolidWithDesignPattern;

public class TitleBook implements Source{
    private String nameTitle;

    public TitleBook(String nameTitle){
        this.nameTitle = nameTitle;
    }
    @Override
    public String getnameTitle() {
        return nameTitle;
    }
    @Override
    public String getSupportSystemType() {
        return "Book";
    }
}
