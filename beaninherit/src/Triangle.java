
public class Triangle {
Point point1;
Point point2;
Point point3;
public Point getPoint1() {
	return point1;
}
public void setPoint1(Point point1) {
	this.point1 = point1;
}
public Point getPoint2() {
	return point2;
}
public void setPoint2(Point point2) {
	this.point2 = point2;
}
public Point getPoint3() {
	return point3;
}
public void setPoint3(Point point3) {
	this.point3 = point3;
}
 void draw()
{
	 System.out.println(point1.getX()+"  "+point1.getY());
	 System.out.println(point2.getX()+"  "+point2.getY());
	 System.out.println(point3.getX()+"  "+point3.getY());
}
}
