package FindOdd;

import java.util.HashMap;

public class FindOdd {
    public static int findIt(int[] a) {
        var map = new HashMap<Integer, Integer>();
        var result = 0;

        for (var item : a){
            if(map.containsKey(item)){
                map.put(item, map.get(item) + 1);
            }
            else{
                map.put(item, 1);
            }
        }

        for (var item: map.entrySet()){
            if(item.getValue() % 2 != 0){
                return item.getKey();
            }
        }

        return  result;
    }
}