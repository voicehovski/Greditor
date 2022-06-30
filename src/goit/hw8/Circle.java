package goit.hw8;

public class Circle extends AbstractShape {
    private Point center;
    private double radius;

    public Circle ( Point cetner, double radius ) {
        this .center = center;
        this .radius = radius;
    }

    @Override
    public String getName (  ) {
        return "Circle";
    }
}
