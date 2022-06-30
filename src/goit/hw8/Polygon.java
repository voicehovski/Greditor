package goit.hw8;

public class Polygon extends AbstractShape {
    private Point [] vertices;

    public Polygon( Point [] vertices ) {
        if ( vertices .length < 3 ) {
            throw new RuntimeException ( "Too fiew vertices for polygon" );
        }
        this .vertices = vertices;
    }

    @Override
    public String getName (  ) {
        return "Polygon";
    }
}
