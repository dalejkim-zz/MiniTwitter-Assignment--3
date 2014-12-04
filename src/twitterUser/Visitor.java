/**
 * 
 */
package twitterUser;

/**
 * @author Dale
 *
 */
public interface Visitor {
	
	public int visitUser(User user);
	public int visitGroup(Group group);
	
	//hmm handle count user positive messages or output it with new class or inside user
	//feel like inside user is more efficient and logical
	
	public void positiveMessages(Message message);
	public void outputInfo(Output output);
}
