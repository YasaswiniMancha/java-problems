package topic.array.arrays2D;

public class Array2D {

	public static void main(String[] args) {
          int[][] mat1 = {
        		  {1,2,3}, {4,5,6}
          };  // 2d array
          
          for(int i=0; i<mat1.length; i++) { //2d array traversing
        	  for(int j=0 ; j< mat1[i].length; j++) {
        		  System.out.print(mat1[i][j]+" "); // not println
        	    }
        	  System.out.println(); //after every row completion , next column starts 
          }
          
          System.out.println("------------------------");
          
          int[][] mat2 = {
        		  {1,2,3}, {4,5,6}
          };  // 2d array
          
          for(int i=mat2.length-1; i>=0; i--) { //2d array traversing
        	  for(int j=mat2[i].length-1 ; j>=0 ; j--) {
        		  System.out.print(mat2[i][j]+" "); // not println
        	    }
        	  System.out.println(); //after every row completion , next column starts 
          }
	}
	
	

}


/*
mat1 :
------
1 2 3
4 5 6

(0,0) , (0,1) , (0,2) 
(1,0) , (1,1) , (1,2)

for i=0  ->  (0,0) , (0,1) , (0,2) are printed first
for i=1  ->  (1,0) , (1,1) , (1,2) are printed 

*/


