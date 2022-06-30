package goit.hw8;

public class Ellipse extends AbstractShape {
    private Point f1;
    private Point f2;

    public Ellipse ( Point f1, Point f2 ) {
        this .f1 = f1;
        this .f2 = f2;
    }

    @Override
    public String getName (  ) {
        return "Ellipse";
    }
}
