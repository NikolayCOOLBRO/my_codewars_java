package ConvertStringToCamelCase;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static String toCamelCase(String s){
        StringBuilder builder = new StringBuilder();
        var isSymbol = false;

        for (var item : s.toCharArray()){
            if(item == '_' || item == '-'){
                isSymbol = true;
                continue;
            }

            if(!builder.isEmpty() && isSymbol){
                builder.append(Character.toUpperCase(item));
                isSymbol = false;
                continue;
            }

            builder.append(item);
        }

        return builder.toString();
    }
}
