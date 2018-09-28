import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReachNowChallenge {
	
	String input;
	
	public ReachNowChallenge(String input) {
		this.input = input;
	}
	
	public Character[][] getFrequencyArray(){
		// Create frequency map
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char x : input.toCharArray()) {
			
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}
			else {
				map.put(x, map.get(x) + 1);
			}
		}
		
		// Return Sorted Array
		return getSortedArray(map);
	}
	

	private Character[][] getSortedArray(Map<Character, Integer> map){
		//initialize 2d array
		Character[][] solution = new Character[map.size()][2];
		
		//map the hashmap to linear object
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
	    });
		
		// map sorted values to 2d array
			for(int i = 0; i < list.size(); i++) {
				
				solution[i][0] = list.get(i).getKey();
				solution[i][1] = Character.forDigit(list.get(i).getValue(), 10);
			}
			
			return solution;
		}
}
