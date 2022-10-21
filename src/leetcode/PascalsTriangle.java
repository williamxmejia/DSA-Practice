package leetcode;

import java.util.ArrayList;
import java.util.List;

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

    public List<List<Integer>> pascalsTriangleList(int n){

        List<List<Integer>> pt = new ArrayList<>();

        if(n == 0) return pt;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        pt.add(first_row);

        for(int i = 1; i < n; i++){
            List<Integer> previous_row = pt.get(i-1);
            List<Integer> rows = new ArrayList<>();

            rows.add(1);

            for(int j =1; j < i; j++){
                rows.add(previous_row.get(j-1) + previous_row.get(j));
            }
            rows.add(1);
            pt.add(rows);
        }

        return pt;
    }

}
