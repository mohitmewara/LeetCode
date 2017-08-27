public class RotateImage {
	public static void main(String[] args) {
		int[][] matrix = {{ 1,2,3},{4,5,6},{7,8,9}} ;
		for(int x=0; x<(matrix.length)/2; x++){
			for(int y=x;y<matrix.length-x-1;y++){
				int temp = matrix[x][y];
				
				matrix[x][y] = matrix[matrix.length-y-1][x];
				matrix[matrix.length-y-1][x] = matrix[matrix.length-x-1][matrix.length-y-1];
				matrix[matrix.length-x-1][matrix.length-y-1] = matrix[y][matrix.length-x-1];
				matrix[y][matrix.length-x-1] = temp;
			}
		}
		
		 for (int i = 0; i < matrix.length; i++)
		    {
		        for (int j = 0; j < matrix.length; j++)
		            System.out.print(matrix[i][j]+" ");
		 
		        System.out.println();
		    }
		    System.out.println();

	}
}
