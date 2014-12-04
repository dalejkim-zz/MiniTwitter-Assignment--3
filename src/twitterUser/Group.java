/**
 * 
 */
package twitterUser;

import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Dale
 *
 */
public class Group implements Component{

	Map<String, Group> numGroup;
	
	private String group;
	//private static final Group instance = new Group();
	private long creationTime;
	
	public Group(String createGroup) {
		setCreationTime(System.currentTimeMillis());
		this.group = createGroup;
	}
	
	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}
	
	public long getCreationTime() {
		return creationTime;
	}

//	public static Group getInstace() {
//		return instance;
//	}
	
	public String getGroup() {
		return group;
	}

	public void setUser(String group) {
		this.group = group;
	}
	
	public String toString() {
		return group;
	}
	
	public void validateGroup() {
		for (Entry<String, Group> entry : numGroup.entrySet())
		{
			if (entry == numGroup || ((Group) numGroup).getGroup().contains(" ")) {
				System.out.println("This Group ID is not a valid one. Please try again.");
			}
		}
	}
	
}
