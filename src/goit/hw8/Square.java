package goit.hw8;

public class Square extends AbstractShape {
    private Point topLeft;
    private double side;

    public Square ( Point topLeft, double side ) {
        if ( side <= 0 ) {
            throw new RuntimeException ( "Square side can`t be <= 0" );
        }
        this .topLeft = topLeft;
        this .side = side;
    }

    @Override
    public String getName (  ) {
        return "Square";
    }
}
