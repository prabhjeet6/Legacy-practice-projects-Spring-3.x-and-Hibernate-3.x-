import java.util.List;


public class Triangle {

	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	void draw()
	{
		for(Point poin:points)
		{
			System.out.println(poin.getX()+" "+poin.getY());
		}
	}
}
