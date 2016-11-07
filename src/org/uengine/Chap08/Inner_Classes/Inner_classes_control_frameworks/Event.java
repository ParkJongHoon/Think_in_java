package org.uengine.Chap08.Inner_Classes.Inner_classes_control_frameworks;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public  Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	public void start(){
		eventTime = System.nanoTime() + delayTime;
	}
	public boolean ready(){
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();

}
