import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.xml.stream.events.StartElement;

public class Test0 {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();

        states.add("california");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
        System.out.println("ArrayList: " + states);
        // Accessing Elements usind .get() Method
        String s = states.get(2);

        System.out.println("I got " + s);

        // Write Loop for this
        System.out.println("ArrayList Size " + states.size());

        for (int i = 0; i < states.size(); i++) {
            System.out.println(states.get(i));
        }
        // Updates Elements using .set() Method

        states.set(2, "Texas");
        System.out.println("After Updation : " + states);

        // Removing Elements using .remove() Method

        String t = states.remove(3);
        System.out.println("State Removed is " + t);
        System.out.println("ArrayList After Deletion " + states);

        // Let us sort the List using .sort() Method

        states.sort(Comparator.naturalOrder());
        System.out.println("ArrayList After Sorting " + states);
        // .contain() Method
        System.out.println("Is NewYork There ? " + states.contains("newyork"));

        // get index of Element using .indexOf() Method

        System.out.println("Texas is at " + states.indexOf("Texas") + " index");
        // you can check if list is empty or not using .isEmpty() Method
        System.out.println("Is List Empty ? " + states.isEmpty());

        states.removeAll(states);

        System.out.println("Is List Empty ? " + states.isEmpty());
    }
}