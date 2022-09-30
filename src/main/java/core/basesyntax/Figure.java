package core.basesyntax;

public abstract class Figure implements FigureArea, Area {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }
}
