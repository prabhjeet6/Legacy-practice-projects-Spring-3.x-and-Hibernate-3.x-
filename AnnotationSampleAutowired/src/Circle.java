import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Circle {

	Point center;

	public Point getCenter() {
		return center;
	}
	@Qualifier("CircleRelated")
    @Autowired
	public void setCenter(Point center) {
		this.center = center;
	}
	void draw()
	{
		System.out.println("Circle drawn"+" "+center.getX()+" "+center.getY());
	}
	
	/*@Autowired is also a bean post processor, used for 
	automatically wiring a property for a bean, so that,
	there is no need to describe the property in the xml.
	if there is only one bean with the same type as the 
	one which is autowired, it will pick that bean, but
	if there are multiple beans available of the required type
	@Autowired will look for bean with the same name as 
	the property autowired.
	
	if for some reason bean with same name  as required is not 
	available, we use @Qualifier as above, and specify the same
	as a qualifer tag inside the desired bean with the required type.
	
	Qualifier uses some namespaces which need to be included in 
	the xml file,in order for the program to run just fine.
	These namespaces are available in projects folder of spring 
	distribution, if we search for annotation config.xml 
	example file.
	
	 Also, as we use Annotations, we have to seprately specify a 
	 bean with the class name for each annotation in the xml 
	 file. we can skip this via using 
	 <context:annotation-config/> in 
	 the xml instead of defining beans for each and every 
	 annotation.
	 */
}
