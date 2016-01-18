package polygonArea;

import java.util.ArrayList;
import java.awt.Point;


public class Triangle implements Polygon{
	private Point pointx1;
	private Point pointx2;
	private Point pointx3;

	public Triangle(Point point1, Point point2, Point point3) {
		// TODO Auto-generated constructor stub
		pointx1 = point1;
		pointx2 = point2;
		pointx3 = point3;
	}

	@Override
	public ArrayList<Point> getPoints() {
		// TODO Auto-generated method stub
		ArrayList<Point> trianglePoints = new ArrayList<Point>();
		trianglePoints.add(pointx1);
		trianglePoints.add(pointx2);
		trianglePoints.add(pointx3);
		return trianglePoints;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		double a = pointx1.distance(pointx2);
		double b = pointx2.distance(pointx3);
		double c = pointx3.distance(pointx1);
		double s = (a+b+c)/2;
		return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	

}
