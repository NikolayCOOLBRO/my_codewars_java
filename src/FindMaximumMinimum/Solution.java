package FindMaximumMinimum;

public class Solution {
    public int min(int[] list) {
        int result = list[0];
        for (var item : list){
            if(item < result){
                result = item;
            }
        }
        return result;
    }

    public int max(int[] list) {
        int result = list[0];
        for (var item : list){
            if(item > result){
                result = item;
            }
        }
        return result;
    }
}
