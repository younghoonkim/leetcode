import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, 0, new ArrayList<>(), result);

        return result;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // 중복 방지를 위해 정렬 필수
        backtrack2(candidates, target, -1, 0, new ArrayList<>(), result);

        return result;

    }

    private void backtrack(int [] candidates, int target, int curIdx, int curSum, List<Integer> curIntResult, List<List<Integer>> result){
        if(curSum == target){
            // 맞음
            result.add(new ArrayList<>(curIntResult));
            return;
        }

        for(int i=curIdx; i<candidates.length; i++){
            if(curSum + candidates[i] <= target){
                // 넣을수있음
                curIntResult.add(candidates[i]);
                backtrack(candidates,target,i,curSum+candidates[i], curIntResult, result);
                curIntResult.remove(curIntResult.size()-1);
            }
        }

    }
    private void backtrack2(int [] candidates, int target, int curIdx, int curSum, List<Integer> curIntResult, List<List<Integer>> result){
        //10,1,2,7,6,1,5
        //1, 1, 2, 5, 6, 7, 10
        if(curSum == target){
            // 맞음
            result.add(new ArrayList<>(curIntResult));
            return;
        }

        for(int i=curIdx+1; i<candidates.length; i++){
            if (i > curIdx+1 && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if(curSum + candidates[i] <= target){
                // 넣을수있음
                curIntResult.add(candidates[i]);
                backtrack2(candidates,target,i,curSum+candidates[i], curIntResult, result);
                curIntResult.remove(curIntResult.size()-1);
            }
        }

    }
}
