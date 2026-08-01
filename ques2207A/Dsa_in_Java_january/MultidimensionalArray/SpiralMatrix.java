package MultidimensionalArray;

import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<Integer> spirallyTraversal(int [][]arr){
     ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int firstRow = 0, lastRow = m - 1, firstCol = 0, lastCol = n - 1;
        
        int tne=m+n;

        while(ans.size()<tne){
            // Right
            for(int j = firstCol; j <= lastCol; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if(ans.size()==tne) break;
            
            // Down
            for(int i = firstRow; i <= lastRow; i++){
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if(ans.size()==tne) break;
            
            // Left
            for(int j = lastCol; j >= firstCol; j--){
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(ans.size()==tne) break;
            
            // Up
            for(int i = lastRow; i >= firstRow; i--){
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sm.spirallyTraversal(matrix));
        // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}