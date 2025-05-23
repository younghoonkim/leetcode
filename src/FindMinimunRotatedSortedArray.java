public class FindMinimunRotatedSortedArray {
    public int findMin(int[] nums) {
        // 10 15 18 29 1 3 5 7 8 9 -- 1찾기
        // binary search로 찾을수 left right mid선정후 최소값이 있을꺼 같은 구역으로 계속 search
        // 10         29   9 면 있을만한부분은 29 - 9
        // 3 5 1
        // 2 2 2 0 1
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left < right){
            mid = (left + right) / 2;
            if(nums[left] > nums[mid]){
                // left - mid 사이에 최소값존재
                // 증가하다 rotate 첫부분이 포함
                right = mid;
            }else if(nums[mid] > nums[right]){
                // mid - right 사이에 최소값존재
                // 증가하다 rotate 첫부분이 포함
                left = mid+1;
            }else{
                right --;
            }
        }

        return nums[left];

    }
}
