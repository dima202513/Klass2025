package PractikLedenevRoman.klassenarbeit3.zadacha;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("black", 6);
        Triangle triangle = new Triangle("red",5,3,4);
        Square square = new Square("blau",6);

        Shape[] shapes = {square, triangle, circle};

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }

}
