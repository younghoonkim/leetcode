public class UniquePath2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 2차원배열로 들어옴

        int [][] dynamic = new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int i=0; i<obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 1){
                break;
            }
            dynamic[i][0] = 1;
        }
        for(int i=0; i<obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i] == 1){
                break;
            }
            dynamic[0][i] = 1;
        }

        for(int i=1; i<obstacleGrid.length; i++){
            for(int j=1; j<obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] == 1){
                    dynamic[i][j] = 0;
                }else{
                    dynamic[i][j] = dynamic[i-1][j] + dynamic[i][j-1];
                }

            }
        }

        return dynamic[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
