import java.util.*;

public class Hash 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Map<Integer, HashSet<String>> myMap = new HashMap<Integer, HashSet<String>>();
		while(in.hasNext()){
			String process = in.next();
			int hashKey = process.hashCode();
			HashSet<String> currentSet = myMap.get(hashKey);
			if(currentSet != null){
				currentSet.add(process);
			}else{
				currentSet = new HashSet<String>();
				currentSet.add(process);
			}
			myMap.put(hashKey, currentSet);
		}
		for(int currentKey : myMap.keySet()){
			HashSet<String> currentSet = myMap.get(currentKey);
			System.out.print(currentKey + ": ");
			Iterator<String> hashIter = currentSet.iterator();
			while(hashIter.hasNext()){
				if(hashIter.hasNext()){
					System.out.print(hashIter.next() + ", ");
				}else{
					System.out.print(hashIter.next());
				}
			}
			System.out.println();
		}
		in.close();
	}
}