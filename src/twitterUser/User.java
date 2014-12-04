package twitterUser;

import java.util.*;

public class User extends Observable implements Observer {

	private String user;
	private List<User> followers = new ArrayList<User>();
	private List<User> following = new ArrayList<User>();
	private List<String> newsFeed = new ArrayList<String>();
	private List<String> tweets = new ArrayList<String>();
	
//	private static final User instance = new User();
	
	private long creationTime;
	private long lastUpdateTime;
	
//	public User() {
//		// empty constructor
//	}
	
	public User(String createUser) {
		setCreationTime(System.currentTimeMillis());
		this.user = createUser;
	}
	
	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}
	
	public long getCreationTime() {
		return creationTime;
	}
	
	public void setLastUpdateTime(long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public long getLastUpdateTime() {
		return lastUpdateTime;
	}
	
	public void displayCreationTime() {
		System.out.println("Created Time" + getCreationTime());
	}
	
	public void displayLastUpdate() {
		System.out.println("User" + getUser() + "Last Updated" + getLastUpdateTime());
	}

//	public static User getInstace() {
//		return instance;
//	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public String toString() {
		return user;
	}
	
	public void followUser(User userID) {
		User stalked = userID;
		this.following.add(stalked);
		notifyObservers(stalked);
		updateUser(stalked);
		followers.add(stalked);
	}
	
	public void writeTweet(String tweet) {
		tweets.add(tweet);
		notifyObservers(tweet);
		updateTweet(tweet);
		setLastUpdateTime(creationTime);
		displayCreationTime();
	}

	@Override
	public void update(String user, String tweet) {
		setLastUpdateTime(creationTime);
		displayCreationTime();
	}

	@Override
	public void update(Subject subject) {
		setLastUpdateTime(creationTime);
		displayCreationTime();
	}

	@Override
	public void updateUser(User stalked) {
		setLastUpdateTime(creationTime);
		displayCreationTime();
	}

	@Override
	public void updateTweet(String tweet) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(Observable arg0, Object arg1) {
		
	}

}
