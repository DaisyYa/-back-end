package Swap;

import java.util.*;

/**
 * class Swap with method doSwap
 */
public class Swap {
    /**
     * swap pair string
     * @param arrayList list of strings
     * @return ArrayList<String>
     */
    public List<String> doSwap(final List<String> arrayList) {
        Map<Character, Integer> map = new HashMap<>();
        String str;
        for (int i = 0; i < arrayList.size(); i++) {
            str = arrayList.get(i);
            if (str != "") {
                if (map.containsKey(str.charAt(0))) {
                    if (map.get(str.charAt(0)) != -1) {
                        Collections.swap(arrayList, map.get(str.charAt(0)), i);
                        map.put(str.charAt(0), -1);
                    }
                } else {
                    map.put(str.charAt(0), i);
                }
            }
        }
        return arrayList;
    }
}
