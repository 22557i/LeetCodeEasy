package Tutoring;

public class FactoryDesign {
    //工厂模式
    public Shape getShape(String shapeType){
        if(shapeType==null)return  null;
        if(shapeType=="circle")return new Circle();
        else if(shapeType=="rec")return new Rectangle();

        return null;
    }

    public static void main(String[] args) {
        FactoryDesign fd = new FactoryDesign();
        fd.getShape("circle").draw();
        fd.getShape("rec").draw();
    }
}
interface Shape{
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("It's Rectangle");
    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("It's circle");
    }
    //Implement Stack and Queue with Node

}