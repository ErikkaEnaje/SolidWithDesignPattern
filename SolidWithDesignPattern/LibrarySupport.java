package SolidWithDesignPattern;

public class LibrarySupport {
    public static void main(String[] args) {

        ResourceBorrow resourceBorrow = new SupportSystemType();

        TitleBook titlebook = new TitleBook(" 'The Romancing of Mr Bridgerton Series 4' ");
        TitleBook titlebooks = new TitleBook(" 'The Seven Husbands of Evelyn Hugo' ");
        Journal journal = new Journal(" 'Keeping a Make Up Journal... - What Can you Learn That you Didn't Know?' ");
        Thesis thesis = new Thesis(" 'The Impact of Temperature Changes on Aircraft Dynamics: A Finite Element Study' ");

        Student erikka = new Student("Erikka");
        Student norman = new Student("\nNorman");
        Student niklaus = new Student("Niklaus");
        Student elijah = new Student("Elijah");

        resourceBorrow.borrowResource(norman.getNameSource(), titlebook);
        resourceBorrow.borrowResource(niklaus.getNameSource(), titlebooks);

        resourceBorrow.borrowResource(elijah.getNameSource(), journal);

        resourceBorrow.borrowResource(erikka.getNameSource(), thesis);


    }
}
