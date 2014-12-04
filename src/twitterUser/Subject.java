package twitterUser;

import java.util.*;
import twitterUser.Observer;

public abstract class Subject {
	
	private String user;
	private String tweet;
	
	private List<Observer> obs = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		obs.add(observer);
	}
	
	public void detach(Observer observer) {
		obs.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer o : obs) {
			o.update(user, tweet);
		}
	}
	
}
