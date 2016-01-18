package polygonArea;

import java.awt.Point;
import java.util.ArrayList;

public class Rectangle implements Polygon{

	private Point pointx1;
	private Point pointx2;
	private Point pointy1;
	private Point pointy2;

	public Rectangle(Point point, Point point2, Point point3, Point point4) {
		// TODO Auto-generated constructor stub
		pointx1 = point;
		pointx2 = point2;
		pointy1 = point3;
		pointy2 = point4;
	}

	@Override
	public ArrayList<Point> getPoints() {
		// TODO Auto-generated method stub
		ArrayList<Point> rectanglePoints = new ArrayList<Point>();
		rectanglePoints.add(pointx1);
		rectanglePoints.add(pointx2);
		rectanglePoints.add(pointy1);
		rectanglePoints.add(pointy2);
		return rectanglePoints;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		double x1x2 = pointx1.distance(pointx2);
		double x2y2 = pointx2.distance(pointy2);
		return (float)(x1x2*x2y2);
	}

	

}
