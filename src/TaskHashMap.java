import java.util.HashMap;
import java.util.Map;

public class TaskHashMap {
	public static void main(String args[]) 
	{
		HashMap<String,Integer> example = new HashMap<String,Integer>();
		example.put("blue",1);
		example.put("blue",1);
		example.put("orange",2);
		example.put("purple",3);
	
		System.out.println("Iterating HashMap...");
		
		for(Map.Entry memory:example.entrySet())
		{
			System.out.println(memory.getKey()+ " "+memory.getValue());
		}
	}
}
