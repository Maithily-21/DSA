class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;

        int temp[][] = new int[row][2];

        for(int i =0 ; i < row ; i++){
            int count = 0 ; 
            for(int j = 0 ; j < col ; j++){
                if(mat[i][j] == 1){
                    count++;
                }
                else break;
            }
             // temp[i][0] = soldier count in row i
             temp[i][0] = count ;
             // temp[i][1] = row index i
             temp[i][1] = i ;
        }

        Arrays.sort(temp , (a , b ) -> {
            if(a[0] == b[0]){
                return Integer.compare(a[1], b[1]); // compare row indices
            }
            return Integer.compare(a[0], b[0]);   // compare soldier counts
        });

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = temp[i][1];  // take row index
        }

        return ans;
    }
}