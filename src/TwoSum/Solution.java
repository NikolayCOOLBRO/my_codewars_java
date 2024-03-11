package TwoSum;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        var arrays = new int[2];

        for (int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == j){
                    continue;
                }
                if(numbers[i] + numbers[j] == target){
                    arrays[0] = i;
                    arrays[1] = j;
                }
            }
        }

        return arrays;
    }
}
