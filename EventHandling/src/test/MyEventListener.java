package test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class MyEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.toString());
	}

}
/*A class needs to  implement ApplicationListener to create a listener 
that listens to both spring Events and user events.
@Component registers listener as a bean.
*/