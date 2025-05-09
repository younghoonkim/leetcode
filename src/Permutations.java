import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, 0, new boolean [nums.length], new ArrayList<>(), result);

        return result;
    }

    private void backTrack(int[] nums, int curLength, boolean [] check, List<Integer> curPermutation, List<List<Integer>> result){
        if(curLength >= nums.length){
            result.add(new ArrayList<>(curPermutation));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!check[i]){
                check[i] = true;
                curPermutation.add(nums[i]);
                backTrack(nums, curLength+1, check, curPermutation, result);
                check[i] =false;
                curPermutation.remove(curPermutation.size()-1);
            }
        }

    }
}
