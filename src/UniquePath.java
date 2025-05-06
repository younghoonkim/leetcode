public class UniquePath {

    public int uniquePaths(int m, int n) {
        // 일단 R,D 의 조합
        // 순열과 조합중 조합 전부 문자가같으면 유니크하지않음.
        // 3,7 > 2, 6 > DDRRRRRR의 나열
        // (2+6)! / 2! / 6! = 8! / 6! / 2! = 8*7 / 2 = 56/2 = 28
        // 이렇게해도 되지만! 수학을 요하는게아닌거같아
        // 동적계획법으로 풀자

        int [][] dynamic = new int[m][n];
        for(int i=0; i<n; i++){
            dynamic[0][i] = 1;
        }
        for(int i=0; i<m; i++){
            dynamic[i][0] = 1;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dynamic[i][j] = dynamic[i-1][j] + dynamic[i][j-1];
            }
        }

        return dynamic[m-1][n-1];
    }
}
