class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double  MaxDiagonal = 0;
        double diagonal ; 
        int area = 0; 

        for(int i = 0 ; i < dimensions.length ; i++){

            int l = dimensions[i][0];
            int b = dimensions[i][1];

            diagonal = Math.sqrt( l*l  + b*b);

            if(diagonal > MaxDiagonal || (diagonal == MaxDiagonal && l*b > area)){
                MaxDiagonal = diagonal ; 
                area = (l * b ) ; 
            }

        }

        return area;
    }
}