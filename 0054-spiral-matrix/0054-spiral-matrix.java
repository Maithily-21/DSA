class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

      List<Integer> spiralOrder = new ArrayList<>();

      //Row   
      int startRow = 0 ;
      int endRow = matrix.length - 1;

      //Column 
      int startCol = 0;
      int endCol = matrix[0].length -1 ;

      while(startRow <= endRow && startCol <= endCol){

        //top boundry 
        for(int j = startCol ; j <= endCol ; j++){
            spiralOrder.add(matrix[startRow][j]);
        }

        //Right boundry 
        for(int i = startRow + 1; i <= endRow; i++){
            spiralOrder.add(matrix[i][endCol]);
        }

        //Bottom Boundry 
         for(int j = endCol -1 ; j >= startCol ; j--){
            if(startRow == endRow){
                   break;
                }
            spiralOrder.add(matrix[endRow][j]);
        }

        //Left Boundry 
        for(int i = endRow - 1; i >startRow; i--){
            if(startCol == endCol){
                    break;
                }
           spiralOrder.add(matrix[i][startCol]);
        }

        //Update the variables
            startRow++;
            endRow--;
            startCol++;
            endCol--;

      }
      return spiralOrder;
    }
}