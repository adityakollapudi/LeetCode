import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                   row.add(i);
                   col.add(j);
                }
            }
        }
        for(int i=0;i<row.size();i++){
            str(matrix,row.get(i),col.get(i));
        }
        
    }
    public void str(int[][] matrix,int row,int col){
        for(int i=0;i<matrix[row].length;i++){
            matrix[row][i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
}