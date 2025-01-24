package klassenarbeit3;

public class Square extends Shape {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

   @Override
public void draw() {
        System.out.println("Square with color " + getColor() + " and side " + side);
}
}
