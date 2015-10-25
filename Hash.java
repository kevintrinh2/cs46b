import java.util.*;

public class Hash {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, TreeSet<String>> myMap = new HashMap<Integer, TreeSet<String>>();
		while (in.hasNext()) {
			String process = in.next();
			int hashKey = process.hashCode();
			TreeSet<String> currentSet = myMap.get(hashKey);
			if (currentSet != null) {
				currentSet.add(process);
			} else {
				currentSet = new TreeSet<String>();
				currentSet.add(process);
			}
			myMap.put(hashKey, currentSet);
		}
		for (int currentKey : myMap.keySet()) {
			TreeSet<String> currentSet = myMap.get(currentKey);
			Iterator<String> hashIter = currentSet.iterator();
			if (currentSet.size() > 1) {
				System.out.print(currentKey + ": ");
				while (hashIter.hasNext()) {
					String current = hashIter.next();
					System.out.print(current + ", ");
				}
				System.out.println();
			}
		}
		in.close();
	}
}