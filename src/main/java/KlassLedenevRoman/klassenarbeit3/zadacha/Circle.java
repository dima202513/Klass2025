package KlassLedenevRoman.klassenarbeit3.zadacha;

public class Circle extends Shape{
    private int radius;
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a circle with radius " + getColor() + "with " + radius);
    }
}
