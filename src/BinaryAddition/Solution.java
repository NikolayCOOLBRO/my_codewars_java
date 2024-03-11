package BinaryAddition;

public class Solution {
    public static String binaryAddition(int a, int b){
        var resultInt = a + b;
        return Integer.toBinaryString(resultInt);
    }
}
