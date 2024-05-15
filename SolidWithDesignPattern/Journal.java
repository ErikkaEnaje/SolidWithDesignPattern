package SolidWithDesignPattern;

public class Journal implements Source {
    private String nameTitle;

    public Journal(String nameTitle){
        this.nameTitle = nameTitle;
    }
    @Override
    public String getnameTitle() {
        return nameTitle;
    }
    @Override
    public String getSupportSystemType(){
        return "Journal";
    }
}
