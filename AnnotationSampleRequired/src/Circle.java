import org.springframework.beans.factory.annotation.Required;


public class Circle {

	Point center;

	public Point getCenter() {
		return center;
	}
    @Required
	public void setCenter(Point center) {
		this.center = center;
	}
	void draw()
	{
		System.out.println("Circle drawn"+" "+center.getX()+" "+center.getY());
	}
	
}
