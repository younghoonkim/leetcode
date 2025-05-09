public class FindNumPosition {

    public int[] searchRange(int[] nums, int target) {
        //[5,7,7,8,8,10]
        //[
        // 이진탐색
        int [] result = new int [] {-1, -1};
        int mid,left,right;

        left = 0;
        right = nums.length - 1;
        if(right < 0){
            return result;
        }
        mid = right/2;

        while(left <= right){

            if(nums[mid] == target){
                // 찾음
                // left < mid < right이므로
                // left+1 < mid < right-1 까지 돌면서 target확인
                // left
                int j = left;
                while(j <= mid){
                    if(nums[j] == target){
                        break;
                    }
                    j++;
                }
                result[0] = j;
                // right
                int k = right;
                while(mid <= k){
                    if(nums[k] == target){
                        break;
                    }
                    k--;
                }
                result[1] = k;
                break;
            }else if(nums[mid] > target){
                // 타겟이 왼쪽에존재
                right = mid - 1;
                mid = (left + right) / 2;
            }else{
                //nums[mid] < target
                // 타겟이 오른쪽에존재
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }

        return result;

    }
}
