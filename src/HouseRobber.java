public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int prev2 = 0;
        int prev1 = nums[0];
        int cur = 0;

        for(int i=1; i<nums.length; i++){
            int pick = nums[i];
            cur = Math.max(pick + prev2, prev1);

            prev2 = prev1;
            prev1 = cur;
        }

        return prev1;

    }
}
