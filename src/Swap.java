import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map newmap = new HashMap();

	      // populate hash map
		 newmap.put("full", "point");
	      newmap.put("apple", "tutorials");
	      
	      newmap.put("ball", "is best");

	      // get keyset value from map
	      Set keyset = newmap.keySet();

	      List<String> listOfCars = new ArrayList<String>(keyset);

	        // to reverse LinkedHashSet contents
	       // Collections.reverse(listOfCars);
	      // check key set values
	      System.out.println("Key set values are: " + listOfCars);
	   }    
	

}
