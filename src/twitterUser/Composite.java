/**
 * 
 */
package twitterUser;

/**
 * @author Dale
 *
 */
public interface Composite {

	public void add(User user);
	public void add(Group group);
	public String getUser();
	public String getGroup();
	public void print();
	
}
