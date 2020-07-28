public class Circle extends Figure{
    private double radius;
    private String color;

    public Circle(double radius, String color) {
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

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

}
