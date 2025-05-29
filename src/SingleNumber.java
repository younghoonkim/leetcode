import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(countMap.containsKey(nums[i])){
                countMap.remove(nums[i]);
            }else{
                countMap.put(nums[i], 1);
            }
        }
        int [] result = new int[2];
        int cnt=0;
        for(Integer n : countMap.keySet()){
            result[cnt++] = n;
        }

        return result;
    }
}
