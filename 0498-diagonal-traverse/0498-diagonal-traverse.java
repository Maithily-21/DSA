class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length ;
        int n = mat[0].length;

        int row = 0 ;
        int col = 0 ;
        int flag = 1 ; // upwards -> 1 , downwards -> -1 

        int temp[] = new int[m*n];

        for(int i = 0 ; i < m*n ; i++){
            temp[i] = mat[row][col];

            //move upwards 
            if(flag == 1){
                if(col == n-1){ // right  boundary hit hui 
                    row++;
                    flag = -1 ;
                }
                else if(row == 0){ // top boundary hit 
                    col++;
                    flag = -1 ;
                } else {
                    row-- ;
                    col++ ;
                } 
            }
            else{ // move downwards 
                if(row == m-1){ // bottom boundary hit 
                    col++;
                    flag = 1 ;
                } else if(col == 0 ){ //left boundary hit 
                    row++;
                    flag = 1 ;
                } else {
                    row++;
                    col--;
                }
            }
        }
        
        return temp ;
    }
}