import java.util.*;

public class SetExample{

    /* The method evenLength takes a set of strings, and returns the
       subset of the strings that are of even length. We do this using
       the set's iterator in a while loop.
    */

    static Set<String> evenLength(Set<String> s) {
        Set<String> result = new TreeSet<String>();
        Iterator<String> iter = s.iterator();
        while(iter.hasNext()) {
            String x = iter.next();
            if (x.length() % 2 == 0)
                result.add(x);
        }
        return result;
    }

    /* The following method does the same thing, but using Java's
     * for-loop syntax, which has exactly the same effect as above.
     */

    static Set<String> evenLength2(Set<String> s) {
        Set<String> result = new TreeSet<String>();
        for(String x: s) {
            if (x.length() % 2 == 0)
                result.add(x);
        }
        return result;
    }

    /* The following method does the same, but using the higher-order
     * forEach method of the set's Iterator interface. (Java 1.8).
     */

    static Set<String> evenLength3(Set<String> s) {
        Set<String> result = new TreeSet<String>();
        s.forEach(x ->
                  {if (x.length() % 2 == 0)
                          result.add(x);
                  });
        return result;
    }

    
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        
        set.add("Aday");
        set.add("hell");
        set.add("bava");
        System.out.println(evenLength3(set));
    }
        
}
