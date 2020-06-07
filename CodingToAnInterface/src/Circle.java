
public class Circle implements Shape {

	Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle drawn");
		System.out.println("Center:"+ center.getX()+ "  "+center.getY());
	}
	
}
