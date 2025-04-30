public class ContainerMostWater {

    public int mostWaterConatain(int[] height){
        int mostWater = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int curHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = curHeight * width;

            if(area > mostWater){
                mostWater = area;
            }
            if(height[left] > height[right]){
                right --;
            }else{
                left ++;
            }

        }

        return mostWater;
    }
}
