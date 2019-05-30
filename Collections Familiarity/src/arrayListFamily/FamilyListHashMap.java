package arrayListFamily;
import java.util.HashMap;
import java.util.Map;

public class FamilyListHashMap {
    public static void main(String[] args) {
        

    	HashMap<String, String> familyMap = new HashMap<String, String>();
        runMap(familyMap);
    }
    
    	public static void runMap (Map<String, String> familyMap) {
    	familyMap.put("Father", "Marshall");
        familyMap.put("Mother", "Raena");
        familyMap.put("First Child", "Tyler");
        familyMap.put("Second Child", "Tanner");
        familyMap.put("Third Child", "RobbieJo");
        familyMap.put("Fourth Child", "Michael");
        familyMap.put("Fifth Child", "Allie");
        familyMap.put("Sixth Child", "Charly");
        familyMap.put("Seventh Child", "Benjamin");
        
        for (String key: familyMap.keySet()) {
        	String value = familyMap.get(key);
            System.out.println(key + " is " + value);
        }
}
}