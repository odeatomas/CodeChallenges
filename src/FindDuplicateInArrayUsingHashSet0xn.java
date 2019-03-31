import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArrayUsingHashSet0xn {
    public static void main(String[]args){
        //using HashSet: java collection
        //stores unique values
        //if unique == false print duplicate name
        // timing is 0(xn)
        String names [] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "Ruby"};

        Set <String> store = new HashSet <>();
        for(String name : names){
            if(store.add(name)== false){
                 System.out.println("Duplicate name is "   + name);
        }}}}

