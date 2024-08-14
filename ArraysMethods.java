package fundamentals;

public class ArraysMethods {
	/*
     * Java static methods exist independently of the instances (objects) of the class. This is, static methods do not use
     * instance variables of the class. Static methods only take input data from its parameters, and can return a value
     * computed with these input data
     */
	
	// Javadoc comment starts with /** and ends with */
	
    public static String toString(int [] vector) {
        String s = "{";

        for (int i=0; i<vector.length; i++) {
            s = s + vector[i];

            if (i<vector.length-1)
                s = s + ", ";
        }
        return s + "}";
    }

    public static String toString(int [] vector, String description) {
        return description + "  " + toString(vector);
    }

    public static String toString(int [][] matrix, String description) {
        String s = description  + "\n";

        for (int i=0; i<matrix.length; i++) 
            s = s + toString(matrix[i]) + "\n";

        return s;
    }

    public static int min(int [] vector) {
    	// returns the min value of a vector
    	int min = vector[0];
    	for(int i=1; i<vector.length; i++) {
    		if(vector[i] < min)
    			min = vector[i];
        }
        return min;
    }

    public static int min(int [][] matrix) {
    	// returns the min value of a matrix
    	int min = matrix[0][0];
    	for(int i=0; i<matrix.length; i++) {
    		for(int j=0; j<matrix[0].length; j++) {
    			if(matrix[i][j] < min)
    				min = matrix[i][j];
    		}
    	}
    	return min;
    }

    public static int max(int [] vector) {
        // returns the max value of a vector
    	int max = vector[0];
    	for(int i=0; i<vector.length; i++) {
    		if(vector[i] > max)
    			max = vector[i];
    	}
    	return max;
    }

    public static int max(int [][] matrix) {
       // returns the max value of a matrix
    	int max = matrix[0][0];
    	for(int i=0; i<matrix.length; i++) {
    		for(int j=0; j<matrix[0].length; j++) {
    			if(matrix[i][j] > max)
    				max = matrix[i][j];
    		}
    	}
    	return max;
    }
    
    public static double avg(int [] vector) {
        // returns the average of a vector
    	double sum = 0.0;
    	double average = 0.0;
    	int numItems = vector.length;
    	
    	for(int i=0; i<numItems; i++) {
    		sum = sum + vector[i];
    	}
    	average = sum / numItems;
    	return average;
    }

    public static int [] sum(int [] A, int [] B) {
        // returns the sum of vectors A and B
    	int[] sums = new int[A.length];
    	
    	for(int i=0; i<A.length; i++) {
    		sums[i] = A[i] + B[i];
    	}
    	return sums;
    }
    
    public static int [][] sum(int [][] A, int [][] B) {
        // returns the sum of matrices A and B
    	int[][] sums = new int[A.length][A[0].length];
    	
    	for(int i=0; i<A.length; i++) {
    		for(int j=0; j<A[0].length; j++) {
    			sums[i][j] = A[i][j] + B[i][j];
    		}
    	}
    	return sums;
    }

    public static int [] mul(int k, int [] vector) {
        // returns the scalar product of k and the input vector
    	int[] prod = new int[vector.length];
    	
    	for(int i=0; i<vector.length; i++) {
    		prod[i] = k * vector[i];
    	}
    	return prod;
    }

    public static int [][] mul(int k, int [][] A) {
        // returns the scalar product of k and the input matrix
    	int[][] prod = new int[A.length][A[0].length];
    	
    	for(int i=0; i<A.length; i++) {
    		for(int j=0; j<A[0].length; j++) {
    			prod[i][j] = k * A[i][j];
    		}
    	}
    	return prod;
    }

    public static int [][] mul(int [][] A, int [][] B) {
        // returns the product of matrices A and B
    	int[][] prodMat = new int[A.length][A[0].length];
    	
    	for(int i=0; i<A.length; i++) {
    		for(int j=0; j<A[0].length; j++) {
    			prodMat[i][j] = 0;
    			for(int c=0; c<A[0].length; c++) {
    				prodMat[i][j] += A[i][c] * B[c][j];
    			}
    		}
    	}
    	return prodMat;
    }
    
    public static boolean equals(int [] A, int [] B) {
       // returns true if vectors A and B are equal and false otherwise
    	int sameItems = 0;
    	
    	if(A.length != B.length)
    		return false;
    	else {
	    	for(int i=0; i<A.length; i++) {
	    		if(A[i] == B[i])
	    			sameItems++;
	    	}
	    	// if count is the same and they are the same sized vector, they're equal
	    	if(sameItems == A.length && sameItems == B.length)
	    		return true;
	    	else
	    		return false;
    	}
    }
    
    public static boolean equals(int [][] A, int [][] B) {
       // returns true if matrices A and B are equal and false otherwise
    	int sameItems = 0;
    	
    	if(A.length != B.length || A[0].length != B[0].length)
    		return false;
    	else {
	    	for(int i=0; i<A.length; i++) {
	    		for(int j=0; j<A[0].length; j++) {
	    			if(A[i][j] == B[i][j])
	    				sameItems++;
	    		}
	    	}
	    	// if count is the same and they are the same sized vector, they're equal
	    	// A.length * A[0].length will yield the total number of items in the matrix (rows * cols)
	    	if(sameItems == A.length * A[0].length && sameItems == B.length * B[0].length)
	    		return true;
	    	else
	    		return false;
    	}
    }
    
    public static boolean identity(int [][] matrix) {
        // returns true if the input matrix is an identity and false otherwise
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	boolean identity = true;
    		
    	if(numRows != numCols) {
    		return false; // matrix should be a square
    	}
    	else {
    		for(int i=0; i<numRows; i++) {
    			for(int j=0; j<numCols; j++) {
    				if(i == j && matrix[i][j] != 1) {
    					identity = false;
    					break;
    				}
    				if(i != j && matrix[i][j] != 0) {
    					identity = false;
    					break;
    				}
    			}
    		}
    	}
    	
    	if(identity == true)
    		return true;
    	else 
    		return false;
    }

    public static int [][] identity(int size) {
        // returns an identity matrix of the input size
    	int numRows = size;
    	int numCols = size;
    	int[][] newMatrix = new int[numRows][numCols];
    	
    	for(int i=0; i<numRows; i++) {
    		for(int j=0; j<numCols; j++) {
    			if(i == j) {
    				newMatrix[i][j] = 1;
    				// System.out.print(newMatrix[i][j]);
    			}
    			else {
    				newMatrix[i][j] = 0;
    				// System.out.print(newMatrix[i][j]);
    			}	
    		}
    		// System.out.println("");
    	}
    	
    	return newMatrix;
    }

    public static boolean square(int [][] matrix) {
        // returns true if the input matrix is a square matrix
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	
    	if(numRows != numCols) // not a square matrix
    		return false;
    	else
    		return true;
   		
    }

    public static boolean diagonal(int [][] matrix) {
        // returns true if the input matrix is a diagonal matrix
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	boolean diagonal = true;
    	
    	if(numRows != numCols) {
    		return false; // matrix should be a square
    	}
    	else {
    		for(int i=0; i<numRows; i++) {
    			for(int j=0; j<numCols; j++) {
    				if(i == j && matrix[i][j] != 1) {
    					diagonal = false;
    					break;
    				}
    				if(i != j && matrix[i][j] != 0) {
    					diagonal = false;
    					break;
    				}
    			}
    		}
    	}
    	
    	if(diagonal == true)
    		return true;
    	else 
    		return false;
    }

    public static boolean symmetric(int [][] matrix) {
        // returns true if the input matrix is symmetric
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	boolean symmetric = true;
    	
    	for(int i=0; i<numRows; i++) {
    		for(int j=0; j<numCols; j++) {
    			if(matrix[i][j] != matrix[j][i]) 
    				symmetric = false;
    		}
    	}
    	
    	if(symmetric == true) 
    		return true;
    	else
    		return false;
    }
    
    public static int [][] transpose(int [][] matrix) {
        // returns the transpose of the input matrix
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	
    	int[][] transposed = new int[numRows][numCols];
    	
    	for(int i=0; i<numRows; i++) {
    		for(int j=0; j<numCols; j++) {
    			transposed[i][j] = matrix[j][i]; // flips positions of matrix
    		}
    	}
    	return transposed;
    }

    public static int [] mainDiagonal(int [][] matrix) {
        // returns the main diagonal of the input matrix
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	
    	int[] mainDiag = new int[numRows];
    	
    	for(int i=0; i<numRows; i++) {
    		for(int j=0; j<numCols; j++) {
    			if(i == j)
    				mainDiag[i] = matrix[i][j];
    		}
    	}
    	return mainDiag;	
    }

    public static int [] counterDiagonal(int [][] matrix) {
        // returns the counter diagonal of the input matrix
    	int numRows = matrix.length;
    	int numCols = matrix[0].length;
    	
    	int[] counterDiag = new int[numRows];
    	
    	for(int i=0; i<numRows; i++) {
    		for(int j=0; j<numCols; j++) {
				if((i+j) == (numRows-1))
    				counterDiag[i] = matrix[i][j];
    		}
    	}
    	return counterDiag;
    }
    
    
    
    public static void main(String[] args) {

        int [] numbers1 = {5, 6, 7, 4, 15, 8, 4};
        int [] numbers2 = {6, 7, 1, 2, 3, 4, 7, 10};
        int [] numbers3 = {5, 6, 7, 4, 15, 8, 4};
        
        System.out.println(toString(numbers1, "numbers-1"));
        System.out.println(toString(numbers2, "numbers-2"));
        System.out.println(toString(numbers3, "numbers-3"));
        
        System.out.println("");
        
        System.out.println("numbers-1 min is " + min(numbers1) + " and max is " + max(numbers1) + ", the average is " + avg(numbers1));
        System.out.println("numbers-2 min is " + min(numbers2) + " and max is " + max(numbers2) + ", the average is " + avg(numbers2));

        System.out.println("");
        
        if (equals(numbers1, numbers2))
            System.out.println("numbers-1 and numbers-2 are equal!");
        else
            System.out.println("numbers-1 and numbers-2 are not equal!");
        
        if (equals(numbers1, numbers3))
            System.out.println("numbers-1 and numbers-3 are equal!");
        else
            System.out.println("numbers-1 and numbers-3 are not equal!");

        int [][] A = {{2, -1, 3}, {-3, 2,  1}, {7, 1, -2}};
        int [][] B = {{1,  4, 1}, { 2, 3, -2}, {5, -1, 4}};
        int [][] C;
        int [][] D;

        C = sum(A, B);
        D = mul(A, B);
        
        System.out.println("");
        
        System.out.println(toString(A, "A"));
        System.out.println(toString(B, "B"));
        System.out.println(toString(C, "C = A+B"));        
        System.out.println(toString(D, "D = AxB"));       

        System.out.println("");
        
        System.out.println(toString(mainDiagonal(C), "C main diagonal"));
        System.out.println(toString(counterDiagonal(C), "C counter diagonal"));
        
        System.out.println("");
        
        if (equals(C, D))
            System.out.println("C and D are equal!");
        else
            System.out.println("C and D are not equal!");
       
        int [][] I;
        
        I = identity(3);
        
        System.out.println("");
        
        System.out.println(toString(I, "I"));
        
        if (identity(I))
            System.out.println("I is identity!");
        else
            System.out.println("I is not identity!");

        if (identity(D))
            System.out.println("D is identity!");
        else
            System.out.println("D is not identity!");

        System.out.println("");
        
        int [][] TC, TT;
        
        TC = transpose(C);
        TT = transpose(TC);
        
        System.out.println(toString(C, "C"));
        System.out.println(toString(TC, "C transpose"));
        System.out.println(toString(TT, "Transpose of C transpose"));

    }
    
}