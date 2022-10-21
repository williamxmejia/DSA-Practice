package leetcode;

public class PascalsTriangle {

    public int [][] pascalsTriangle(int n) {

        int[][] pt = new int[n][];

        for(int i = 0; i < n; i++){
            pt[i] = new int[n+1];
            pt[i][0] = 1;

            for(int j = 1; j < i; j++){
               pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
            }
            pt[i][i] = 1;
        }
        return pt;
    }

}