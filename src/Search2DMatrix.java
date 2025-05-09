public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=0;

        // row수준으로 찾기
        while(true){
            if(i >= matrix.length){
                return false;
            }

            if(matrix[i][matrix[i].length-1] < target){
                i++;
            }else if(matrix[i][matrix[i].length-1] > target){
                break;
            }else{
                return true;
            }
        }
        // column수준으로 찾기
        int left = 0;
        int right = matrix[i].length-1;
        int mid = right / 2;
        while(left <= right){
            if(matrix[i][mid] == target){
                return true;
            }else if(matrix[i][mid] < target){
                left = mid+1;
                mid = (left + right) / 2;
            }else{
                right = mid-1;
                mid = (left + right) / 2;
            }
        }
        return false;

    }
    public boolean searchMatrix2(int[][] matrix, int target) {

        int i = matrix.length-1;
        int j = 0;

        while(i >= 0 && j <= matrix[0].length-1){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                j++;
            }else if(matrix[i][j] > target){
                i--;
            }
        }
        return false;
    }
}
