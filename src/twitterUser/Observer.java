package twitterUser;

public interface Observer {
	
	public void update(String user, String tweet);
	public void update(Subject subject);
	public void updateUser(User stalked);
	public void updateTweet(String tweet);
	
}
