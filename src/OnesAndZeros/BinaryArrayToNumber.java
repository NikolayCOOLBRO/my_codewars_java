package OnesAndZeros;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        var result = 0;

        for (int i = 1; i <= binary.size(); i++){
            result += (int) (binary.get(i - 1) * Math.pow(2, binary.size() - i));
        }

        return  result;
    }
}
