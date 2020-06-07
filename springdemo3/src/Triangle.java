import java.util.List;

public class Triangle {
private List<Point> points;

void draw()
{
	for(Point poin:points)
	{
		System.out.println(poin.getX()+""+poin.getY());
	}
		
}

public List<Point> getPoints() {
	return points;
}

public void setPoints(List<Point> points) {
	this.points = points;
}
}
