public class Triangle  extends Figure{
    private double hypotenuse;
    private double height;

    public Triangle(double hypotenuse, Color color, double height) {
        this.hypotenuse = hypotenuse;
        this.color = color;
        this.height = height;
    }

    public String draw() {
        return "треугольник, " + "площадь: " + String.format("%1$,.2f", getArea()) + "кв.ед., " +
                "гипотенуза: " + getHypotenuse() + "ед., " + "цвет: " + getColor();
    }

    public double getArea() {
        return 0.5 * hypotenuse * height;
    }

    public Color getColor() {
        return color;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
}
