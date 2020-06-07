import java.util.List;


public class Triangle {

	Point PointA;
	Point PointB;
	Point PointC;
	public Point getPointA() {
		return PointA;
	}
	public void setPointA(Point pointA) {
		PointA = pointA;
	}
	public Point getPointB() {
		return PointB;
	}
	public void setPointB(Point pointB) {
		PointB = pointB;
	}
	public Point getPointC() {
		return PointC;
	}
	public void setPointC(Point pointC) {
		PointC = pointC;
	}
	void draw()
	{
		System.out.println(PointA.getX()+" "+PointA.getY());
		System.out.println(PointB.getX()+" "+PointB.getY());
		System.out.println(PointC.getX()+" "+PointC.getY());
	}
}
