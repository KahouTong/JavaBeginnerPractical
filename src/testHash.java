import java.util.HashSet;
import java.util.Iterator;

public class testHash {
	public static void main(String args[])
	{
		HashSet<String> task = new HashSet<>();
		
		task.add("a");
		task.add("d");
		task.add("c");
		task.add(null);
		task.add("b");		
		task.add("c");

		Iterator<String> taskss = task.iterator();
		
		while(taskss.hasNext())
		{
			System.out.println(taskss.next());
		}
	}
}
