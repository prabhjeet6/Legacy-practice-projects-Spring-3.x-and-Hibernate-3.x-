package test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements ApplicationEventPublisherAware {
//ApplicationEventPublisherAware is used to tell spring about the 
//	ApplicationEventPublisher interface ref.
	private ApplicationEventPublisher publisher;

	public MessageSource getMessage() {
		return message;
	}

	public ApplicationEventPublisher getPublisher() {
		return publisher;
	}

	public void setPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
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
	
	void draw() {
		System.out.println(this.message.getMessage("drawing.circle", null,
				"default greeting", null));
		System.out.println(this.message.getMessage("drawing.point",
				new Object[] { center.getX(), center.getY() },
				"default greeting", null));
		System.out.println(this.message.getMessage("greeting", null,
				"default greeting", null));
		MyEvent me = new MyEvent(this);
		publisher.publishEvent(me);// coding to interface
	//we could also say,context.publishEvent(me), as ApplicationContext
	//also implements publish event method, passing the event object
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
		//ApplicationEventPublisherAware method to make spring aware of 
		//of publisher ref. Publisher publishes the event as,
		//MyEvent me = new MyEvent(this); passing circle object.
	//	the listener , which is a bean, 
	}
}
