package test;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "MyEventCalled";
	}

}

//A class needs to  extend ApplicationEvent to make a custom event
