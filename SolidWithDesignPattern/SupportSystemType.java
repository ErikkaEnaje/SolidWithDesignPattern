package SolidWithDesignPattern;

public class SupportSystemType implements ResourceBorrow{
    @Override
    public void borrowResource(String name, Source source) {
       System.out.println(name + " is Borrow of " + source.getSupportSystemType()
               + ", The Title is " + source.getnameTitle());
    }
}
