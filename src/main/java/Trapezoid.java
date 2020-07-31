public class Trapezoid extends Figure {
    private double side1;
    private double side2;
    private double height;

    public Trapezoid(double side1, double side2, double height, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.color = color;
    }

    public String draw() {
        return "трапеция, " + "площадь: " + String.format("%1$,.2f", getArea()) + "кв.ед., " +
                "высота: " + getHeight() + "ед., " + "цвет: " + getColor();
    }

    public double getArea() {
        return ((side1 + side2) * height) / 2;
    }

    public Color getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }
}
