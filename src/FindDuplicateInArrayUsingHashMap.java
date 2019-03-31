import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateInArrayUsingHashMap {
    public static void main (String[]args){
        String names [] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};
        Map <String ,Integer> storeMap = new HashMap <>();

        for (String name : names) {
            Integer count = storeMap.get(name);
            if (count == null) {
                storeMap.put(name, 1);
            } else {
                storeMap.put(name, ++count);
            }
            //get the values from the hashmap
        }
        Set <Map.Entry <String, Integer>> entrySet = storeMap.entrySet();
        // set values
        for(Map.Entry <String, Integer> entry : entrySet) {
            // check if value is more than one
            if(entry.getValue()>1){
            System.out.println("duplicate entry is "  +entry.getKey());
        }
    }}}
