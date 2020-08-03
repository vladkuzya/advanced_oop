import java.util.Random;

public class Main {

    private static double numGenerator() {
        Random random = new Random();
        return (random.nextInt(100) + random.nextInt(100) * 100) / 100.0;
    }

    private static Color colorGenerator() {
        Random random = new Random();
        Color[] colors = Color.values();

        return colors[random.nextInt(colors.length)];
    }

    public static void main(String[] args) {
        Figure[] figures = new Figure[2 + (int) (Math.random() * 8)];

        for (int i = 0; i < figures.length; i++) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 1:
                    figures[i] = new Square(numGenerator(), colorGenerator());
                    break;
                case 2:
                    figures[i] = new Circle(numGenerator(), colorGenerator());
                    break;
                case 3:
                    figures[i] = new Triangle(numGenerator(), colorGenerator(), numGenerator());
                    break;
                default:
                    figures[i] = new Trapezoid(numGenerator(), numGenerator(), numGenerator(), colorGenerator());
                    break;
            }
        }
        for (Figure figure : figures) {
            System.out.println("Фигура: " + figure.draw());
        }

    }
}
