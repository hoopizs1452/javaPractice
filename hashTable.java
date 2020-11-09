import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, String> countryCity = new HashMap<String, String>();
//		countryCity.put("England", "London");
//		countryCity.put("Germany", "Berlin");
//		countryCity.put("Norway", "Oslo");
//		countryCity.put("USA", "Washington DC");
//		System.out.println(countryCity);
//		countryCity.get("England");
//		countryCity.remove("England");
//		countryCity.clear();
//		countryCity.size();
//		ArrayList<Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(countryCity.entrySet());
		HashMap<String, String> 國家首都 = new HashMap<String, String>();

		國家首都.put("England", "London");
		國家首都.put("Germany", "Berlin");
		國家首都.put("Norway", "Oslo");
		國家首都.put("USA", "Washington DC");
		System.out.println(國家首都);
		國家首都.get("England");
		國家首都.remove("England");
		國家首都.clear();
		國家首都.size();
		ArrayList<Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(國家首都.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
	           @Override
	           public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
	               return o2.getValue().compareTo(o1.getValue());
	           }
	       });
		
		for (String i : 國家首都.keySet()) {
			System.out.println(i);
		}
		for (String i : 國家首都.values()) {
			System.out.println(i);
		}
		for (String i : 國家首都.keySet()) {
			System.out.println("key: " + i + " value: " + 國家首都.get(i));
	}
	}
}
