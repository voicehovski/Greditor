
package goit.hw8;

public class GreditorMain {
    public static void main(String[] args) {
        Shape [] shapes = {
                new Circle ( new Point (0, 0), Math .PI ),
                new Square ( new Point( 10, 10 ), Math .E ),
                new Rectangle ( new Point( -10, -10 ), 10,10 ),
                new Ellipse ( new Point( 100, 100 ), new Point( 100, 150 ) ),
                new Polygon ( new Point [] {
                        new Point( 10, 10 ),
                        new Point( 100, 100 ),
                        new Point( 200, 300 )
                } )
        };

        ShapeViewer viewer = new ShapeViewer (  );
        for ( Shape shape : shapes ) {
            viewer .view ( shape );
        }
    }
}
