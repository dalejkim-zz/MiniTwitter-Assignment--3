/**
 * 
 */
package app;

/**
 * @author Dale
 *
 */
public interface Panel {
	
	public void createUser();
	public void createGroup();
	public void createTweet();
	public void notifyObservers();
	public void followUser();
	public void displayGroup();
	public void displayUsers();
	public void displayMessages();
	public void displayPosPercentage();
}
