public class Main {

    public static double numGenerator() {
        return Double.parseDouble(String.format("%1$,.2f",1 + (Math.random() * 10)).replace(",", "."));
    }

    public static String colorGenerator() {
        int random = (int) (Math.random() * 5);
        switch (random) {
            case 1:
                return "Красный";
            case 2:
                return "Желтый";
            case 3:
                return "Зеленый";
            case 4:
                return "Синий";
            default:
                return "Белый";
        }
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
