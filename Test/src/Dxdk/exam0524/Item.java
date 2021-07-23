package Dxdk.exam0524;



public class Item implements Lendable{
    private String title;
    private double lateFee;

    public Item(String title, double lateFee) {
        this.title = title;
        this.lateFee = lateFee;
    }

    public boolean equals(Item o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.lateFee, this.lateFee) == 0 && this.title.equals(o.title);
    }

    @Override
    public String toString(){
        return this.title;
    }

    @Override
    public double calculateFees(int num){
        return this.lateFee*num;
    }
}
