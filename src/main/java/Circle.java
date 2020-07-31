public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public String draw() {
        return "круг, " + "площадь: " + String.format("%1$,.2f", getArea()) + "кв.ед., " +
                "радиус: " + getRadius() + "ед., " + "цвет: " + getColor();
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Color getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

}
