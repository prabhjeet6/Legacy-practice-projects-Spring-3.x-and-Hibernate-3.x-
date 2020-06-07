package test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle {

	public MessageSource getMessage() {
		return message;
	}

	public void setMessage(MessageSource message) {
		this.message = message;
	}

	Point center;
	// MessageSource is also an interface, that is why, took as an
	// instance variable.
	@Autowired
	private MessageSource message;

	public Point getCenter() {
		return center;
	}

	@Resource()
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	void myinit() {
		System.out.println("myinit");
	}

	@PreDestroy
	void mydestroy() {
		System.out.println("mydestroy");
	}

	void draw()
	{
		System.out.println(this.message.getMessage("drawing.circle",null,"default greeting",null));
		System.out.println(this.message.getMessage("drawing.point",new Object[]{center.getX(),center.getY()},"default greeting",null));
		System.out.println(this.message.getMessage("greeting",null,"default greeting",null));
	}
}

