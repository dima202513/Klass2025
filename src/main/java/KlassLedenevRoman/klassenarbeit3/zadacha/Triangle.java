package KlassLedenevRoman.klassenarbeit3.zadacha;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(String color, int side1, int side2, int side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void draw(){
        System.out.println("draw triangle of " + getColor() + " side1 " + side1 + "side2 " + side2 + "side3 " + side3);
    }
}
