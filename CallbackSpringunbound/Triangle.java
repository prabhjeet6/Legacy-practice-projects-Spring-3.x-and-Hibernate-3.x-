import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Triangle{
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
@Override
public void myinit() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Intitialising");
	
}
@Override
public void end()  {
	System.out.println("Destroying");
	// TODO Auto-generated method stub
	
}
public void myinit1() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Intitialising1");
	
}
@Override
public void end1()  {
	System.out.println("Destroying1");
	// TODO Auto-generated method stub
	
}
void draw()
{
	System.out.println("Draw");
}
}
