package exam0407.q3;

public class Rec {
    private int length;
    private int width;

    public Rec(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rec{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void enlarge(Rec rec){
        rec.setLength(rec.getLength()+1);
        rec.setWidth(rec.getWidth()+1);
    }

    public static void main(String[] args) {
        Rec rec = new Rec(3,4);
        System.out.println(rec);
        enlarge(rec);
        System.out.println(rec);
    }
}
