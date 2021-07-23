package Dxdk.exam0524;

public class Book extends Item{
    private Name author;
    public Book(String title, Name author) {
        super(title,0.15);
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.author;
    }
}
class Name{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
