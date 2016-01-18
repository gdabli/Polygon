package polygonArea;

import java.awt.Point;
import java.util.*;

public class Test {
	public static void main(String[] args){
		
		// Giving Inputs to polygon Triangle and Rectangle
		ArrayList<Polygon> p = new ArrayList<Polygon>();
		p.add(new Triangle( new Point(1,1),new Point(3,4),new Point(1,5) ));
		p.add(new Triangle( new Point(2,2),new Point(4,4),new Point(6,2) ));
		p.add( new Rectangle ( new Point(1,1),new Point(3,1),new Point(1,3),new Point(3,3)));
		p.add( new Rectangle ( new Point(1,1),new Point(7,1),new Point(1,8),new Point(7,8)));
		
		//Using Iterator
		Iterator<Polygon> iterator = p.iterator();
		while( iterator.hasNext() ){
			System.out.println("..................................................");
			Polygon nextPolygon = iterator.next();
			ArrayList<Point> points = nextPolygon.getPoints();
			System.out.println("The Points in Polygon are as follow:");
			for(Point p1 : points){
				System.out.println(p1.getX()+","+p1.getY());
			}
			System.out.println( "The Area of this polygon is "+nextPolygon.getArea() );
		 } 

	}
	
}
