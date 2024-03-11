package SplitString;

public class StringSplit {
    public static String[] solution(String s) {
        if(s.length() % 2 != 0){
            s += "_";
        }

        var result = new String[s.length()/2];
        var builder = new StringBuilder();

        int index = 0;
        for (var item : s.toCharArray()){
            builder.append(item);

            if(builder.length() == 2){
                result[index] = builder.toString();
                builder.delete(0,2);
                index++;
            }
        }

        return result;
    }
}
