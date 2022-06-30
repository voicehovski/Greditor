package goit.hw8;

public class Rectangle extends AbstractShape {
    private Point topLeft;
    private double shortSide;
    private double longSide;

    public Rectangle ( Point topLeft, double shortSide, double longSide ) {
        this .topLeft = topLeft;
        this .shortSide = shortSide;
        this .longSide = longSide;
    }

    @Override
    public String getName (  ) {
        return "Rectangle";
    }
}
