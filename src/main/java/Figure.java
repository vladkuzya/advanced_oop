public abstract class Figure {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor () {
        return color;
    }

    public String draw () {
        return "";
    };
    private double getArea () {
        return 0;
    };


}
