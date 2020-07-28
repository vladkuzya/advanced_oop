public class Square extends Figure {
    private double side;
    private String color;

    public Square (double side, String color) {
        this.side = side;
        this.color = color;
    }

    public String draw() {
        return "квадрат, " + "площадь: " + String.format("%1$,.2f", getArea()) + "кв.ед., " +
                "сторона: " + getSide() + "ед., " + "цвет: " + getColor();
    }

    public double getArea() {
        return side * side;
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }
}
