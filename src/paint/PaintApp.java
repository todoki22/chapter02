package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX( 100 );
		point1.setY( 200 );
		point1.show();

		Point point2 = new Point();
		point2.setX( 10 );
		point2.setY( 20 );
		point2.show();
		point2.show( false );
		
		Point point3 = new ColorPoint();
		point3.setX( 300 );
		point3.setY( 200 );
		((ColorPoint)point3).setColor( "red" );
		point3.show();
		point3.show(true);
		
	}

}
