package SolidWithDesignPattern;

public class Thesis implements Source {
    private String nameTitle;

    public Thesis(String nameTitle) {
        this.nameTitle = nameTitle;
    }
    @Override
    public String getnameTitle() {
        return nameTitle;
    }
    @Override
    public String getSupportSystemType() {
        return "Thesis";
    }
}
